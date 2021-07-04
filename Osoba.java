package GUI_PROJEKT_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Osoba {

    String imię;
    String nazwisko;
    double pesel;
    String adres;
    LocalDate dataUrodzenia;
    static int zmiennaPomocnicza = 1;
    int osobaID;

    boolean opłata = false;
    LocalDate dataRozpoczęciaNajmuPomieszczenia;
    LocalDate dataZakończeniaNajmuPomieszczenia;
    static LocalDate dataRozpoczęciaNajmuMieszkania;
    LocalDate dataZakończeniaNajmuMieszkania;
    LocalDate dataRozpoczęciaNajmuMiejscaParkingowego;
    static LocalDate dataZakończeniaNajmuMiejscaParkingowego;
    int liczbaWynajęć = 0;
    boolean wynajęteMieszkanie = false;
    boolean wynajęteMiejsceParkingowe = false;
    boolean najemca = false; // będzie przyjmować wartość true dla pierwszej osoby wynajmującej mieszkanie
    int LiczbaWynajęć = 0;
    int liczbaPrzedawnień=0;

    public Osoba(String imię, String nazwisko, double pesel, String adres, LocalDate dataUrodzenia){
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.adres = adres;
        this.dataUrodzenia = dataUrodzenia;
        osobaID = zmiennaPomocnicza++;
    }

    public void wynajmijPomieszczenie(Pomieszczenie pomieszczenie, int czasWynajęcia) throws ProblematicTenantException{ // czasWynajęcia podany w dniach
        ++liczbaWynajęć;
        dataRozpoczęciaNajmuPomieszczenia = LocalDate.now();
        dataZakończeniaNajmuPomieszczenia = dataRozpoczęciaNajmuPomieszczenia.plusDays(czasWynajęcia);
        System.out.println("Wynajmujesz pomieszczenie o powierzchni: " + pomieszczenie.powierzchniaUżytkowa
                + " i o numerze identyfikacyjnym: " + pomieszczenie.numerIdentyfikacyjny );

        if(liczbaWynajęć >= 5){
            System.out.println("Nie możesz wynająć mieszkania - wynajmujesz za dużo pomieszczeń");
        }
        wynajęteMieszkanie = true;

    }

    public void wynajmijMieszkanie(Mieszkanie mieszkanie, int czasWynajęcia) throws ProblematicTenantException{ // czasWynajęcia podany w dniach
        ++liczbaWynajęć;
        dataRozpoczęciaNajmuMieszkania = LocalDate.now();
        dataZakończeniaNajmuMieszkania = dataRozpoczęciaNajmuMieszkania.plusDays(czasWynajęcia);
        System.out.println("Wynajmujesz mieszkanie o powierzchni: " + mieszkanie.powierzchniaUżytkowa
                + " i o numerze identyfikacyjnym: " + mieszkanie.numerIdentyfikacyjny );

        if(liczbaWynajęć >= 5){
            System.out.println("Nie możesz wynająć mieszkania - wynajmujesz za dużo pomieszczeń");
        }
        wynajęteMieszkanie = true;
    }

    public void wynajmijMiejsceParkingowe(MiejsceParkingowe parking, int czasWynajęcia) throws ProblematicTenantException{
        if(wynajęteMieszkanie) {
            ++liczbaWynajęć;
            dataRozpoczęciaNajmuMiejscaParkingowego = LocalDate.now();
            dataZakończeniaNajmuMiejscaParkingowego = dataRozpoczęciaNajmuMiejscaParkingowego.plusDays(czasWynajęcia);
            liczbaWynajęć++;
            if (liczbaWynajęć >= 5) {
                System.out.println("Nie możesz wynająć miejsca parkingowego - wynajmujesz za dużo pomieszczeń");
            }
            wynajęteMiejsceParkingowe=true;

        }
    }

    public void odnówNajemMieszkania(Mieszkanie m){
        if(opłata) {
            dataRozpoczęciaNajmuMieszkania = LocalDate.now();
            dataZakończeniaNajmuMieszkania = dataRozpoczęciaNajmuMieszkania.plusDays(30);
        }
    }

    public void anulujNajemMieszkania(Mieszkanie m){
        if(wynajęteMieszkanie) {
            System.out.println("Anulowałeś najem " + m.numerIdentyfikacyjny);
            dataZakończeniaNajmuMieszkania = LocalDate.now();
            wynajęteMieszkanie = false;
        }
    }

    public void anulujNajemMiejscaParkingowego(MiejsceParkingowe mp){
        if(wynajęteMiejsceParkingowe) {
            System.out.println("Anulowałeś najem " + mp.numerIdentyfikacyjny);
            dataZakończeniaNajmuMiejscaParkingowego = LocalDate.now();
            wynajęteMiejsceParkingowe=false;
        }
    }

    public void dodajOsobę(Osoba osoba){
        if(wynajęteMieszkanie) {
            System.out.println("Dodałeś " + osoba.imię + " " + osoba.nazwisko + " jako swojego wspólokatora");
        }
    }

    public void wstawPojazd(Pojazd pojazd, Pomieszczenie miejsceParkingowe){

        if(wynajęteMiejsceParkingowe) {
            if (pojazd.powierzchnia <= miejsceParkingowe.powierzchniaUżytkowa) {
                System.out.println("Wstawiłeś pojazd na miesjce parkingowe");
                miejsceParkingowe.powierzchniaUżytkowa=miejsceParkingowe.powierzchniaUżytkowa-pojazd.powierzchnia;
            } else {
                try {
                    throw new TooManyThingsException();
                } catch (TooManyThingsException e) {
                    e.getMessage();
                }
                System.out.println("Nie możesz wstawić " + pojazd.nazwa + "na mmiejsce parkingowe " + miejsceParkingowe.numerIdentyfikacyjny
                        + ", ponieważ nie masz wystarczająco miejsca.");
            }
        }
    }

    public void wstawPrzedmiot(Przedmiot przedmiot, Pomieszczenie miejsceParkingowe){
        if(wynajęteMiejsceParkingowe){
            if (przedmiot.powierzchnia <= miejsceParkingowe.powierzchniaUżytkowa) {
                System.out.println("Wstawiłeś pojazd na miesjce parkingowe");
                miejsceParkingowe.powierzchniaUżytkowa=miejsceParkingowe.powierzchniaUżytkowa-przedmiot.powierzchnia;
            } else {
                try {
                    throw new TooManyThingsException();
                } catch (TooManyThingsException e) {
                    e.getMessage();
                }
                System.out.println("Nie możesz wstawić " + przedmiot.nazwa + "na mmiejsce parkingowe " + miejsceParkingowe.numerIdentyfikacyjny
                        + ", ponieważ nie masz wystarczająco miejsca.");
            }
        }
    }

    public void zapłaćZaMieszkanie (){
        if(wynajęteMieszkanie) {
            opłata = true;
        }

    }

    public void zaloguj(ArrayList<Osoba>mieszkańcy){
        System.out.println("Podaj swoje ID mieszkańca");
        Scanner s = new Scanner(System.in);
        int ID = s.nextInt();
        if(ID == osobaID){
            System.out.println("Zostałeś zalogowany jako " + imię + " " + nazwisko + ".");
        }else{
            System.out.println("Podałeś złe ID. Spróbuj jeszcze raz.");
        }
    }

    @Override
    public String toString(){
        return "Imię: " + imię +  "\nNazwisko: " + nazwisko + "\nPESEL: " + pesel;

    }
}
