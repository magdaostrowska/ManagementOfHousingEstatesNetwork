package GUI_PROJEKT_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {


    Thread wątek1 = new Thread(new Data());
    Thread wątek2 = new Thread(new SprWynajmu());
    wątek1.start();
    wątek2.start();

    // OSIEDLE I BLOKI

    Osiedle osiedle = new Osiedle("Osiedle Zielone", 5);
    Blok b1 = new Blok(20, 1);
    Blok b2 = new Blok(15, 2);
    Blok b3 = new Blok(7, 3);
    Blok b4 = new Blok(20, 4);
    Blok b5 = new Blok(20, 5);

    b1.dodajAdres("Leśna 1, 04-118 Warszawa");
    b2.dodajAdres("Leśna 2, 04-118 Warszawa");
    b3.dodajAdres("Leśna 3, 04-118 Warszawa");
    b4.dodajAdres("Leśna 4, 04-118 Warszawa");
    b5.dodajAdres("Leśna 5, 04-118 Warszawa");

    ArrayList<Blok> osiedleZielone = new ArrayList<>();
    osiedleZielone.add(b1);
    osiedleZielone.add(b2);
    osiedleZielone.add(b3);
    osiedleZielone.add(b4);
    osiedleZielone.add(b5);

    System.out.println("-=-=- Osiedle zielone -=-=-");
        for (Blok b: osiedleZielone){
            System.out.println(b);
            System.out.println();
        }


    // MIESZKAŃCY

    Osoba o1 = new Osoba("Jan", "Kowalski", 01347572438d, b1.adres, LocalDate.of(1975, 04, 20));
    Osoba o2 = new Osoba("Wojciech", "Nowicki", 02438574382d, "Kwiatowa 21", LocalDate.of(1956, 01, 30));
    Osoba o3 = new Osoba("Marcin", "Jastrzębski", 02138783526d, "Noskowskiego 8", LocalDate.of(1999, 11, 12));
    Osoba o4 = new Osoba("Anna", "Styczyńska", 02347365723d, "Orzeszkowej 37", LocalDate.of(1984, 07, 15));
    Osoba o5 = new Osoba("Aleksandra", "Statuch", 02437230914d, "Igańska 234", LocalDate.of(1995, 9,03));


    ArrayList<Osoba> mieszkańcy = new ArrayList<>();
    mieszkańcy.add(o1);
    mieszkańcy.add(o2);
    mieszkańcy.add(o3);
    mieszkańcy.add(o4);
    mieszkańcy.add(o5);

    System.out.println("-=-=- MIESZKAŃCY -=-=-");
    for (Osoba o: mieszkańcy){
        System.out.println(o);
        System.out.println();
    }

    // POMIESZCZENIA

    Pomieszczenie m1 = new Mieszkanie(100.25);
    Pomieszczenie m2 = new Mieszkanie (47);
    Pomieszczenie m3 = new Mieszkanie(56.50);
    Pomieszczenie m4 = new Mieszkanie(68.40);
    Pomieszczenie m5 = new Mieszkanie(85.30);
    Pomieszczenie m6 = new Mieszkanie(70.35);

    Pomieszczenie mp1 = new MiejsceParkingowe(11.5);
    Pomieszczenie mp2 = new MiejsceParkingowe(12);
    Pomieszczenie mp3 = new MiejsceParkingowe(13.2);
    Pomieszczenie mp4 = new MiejsceParkingowe(18);
    Pomieszczenie mp5 = new MiejsceParkingowe(14.5);

    ArrayList<Pomieszczenie> pomieszczenia = new ArrayList<>();
    pomieszczenia.add(m1);
    pomieszczenia.add(m2);
    pomieszczenia.add(m3);
    pomieszczenia.add(m4);
    pomieszczenia.add(m5);
    pomieszczenia.add(m6);
    pomieszczenia.add(mp1);
    pomieszczenia.add(mp2);
    pomieszczenia.add(mp3);
    pomieszczenia.add(mp4);
    pomieszczenia.add(mp5);

    /*


    System.out.println("-=-=- POMIESZCZENIA (przed posortowaniem)-=-=- ");
    for (Pomieszczenie p: pomieszczenia){
        System.out.println(p);
        System.out.println();
    }

     */

        System.out.println("-=-=- POMIESZCZENIA (po posortowaniu)-=-=- ");
        Collections.sort(pomieszczenia, Comparator.comparingDouble(Pomieszczenie::getPowierzchniaUżytkowa));
        pomieszczenia.forEach(Pomieszczenie -> System.out.println(pomieszczenia));

    // PRZEDMIOTY

    Przedmiot przedmiot1 = new Przedmiot("telewizor", 1);
    Przedmiot przedmiot2 = new Przedmiot("szafa", 12);
    Przedmiot przedmiot3 = new Przedmiot("bieżnia", 4);
    Przedmiot przedmiot4 = new Przedmiot("skrzynka", 5);
    Przedmiot przedmiot5 = new Przedmiot("karton", 1.5);
    Przedmiot przedmiot6 = new Przedmiot("biblioteczka", 16);

    ArrayList<Przedmiot> przedmioty = new ArrayList<>();
    przedmioty.add(przedmiot1);
    przedmioty.add(przedmiot2);
    przedmioty.add(przedmiot3);
    przedmioty.add(przedmiot4);
    przedmioty.add(przedmiot5);
    przedmioty.add(przedmiot6);

        System.out.println();

        System.out.println("-=-=- PRZEDMIOTY -=-=-");
        for (Przedmiot przedmiot: przedmioty){
            System.out.println(przedmiot);
            System.out.println();
        }

        System.out.println("-=-=- PRZEDMIOTY (po posortowaniu)-=-=- ");
        Collections.sort(przedmioty, Comparator.comparingDouble(Przedmiot::getPowierzchnia).reversed());
        pomieszczenia.forEach(Przedmiot -> System.out.println(przedmioty));

    // POJAZDY

    Pojazd p1 = new SamochódMiejski("Volvo", 12, "combi");
    Pojazd p2 = new SamochódTerenowy("Jeep", 15, 2);
    Pojazd p3 = new Motocykl("Yamaha", 2.16, 2);
    Pojazd p4 = new Łódź("Jacht", 30, 4);
    Pojazd p5 = new Amfibia("Amfibia", 45, false);

    ArrayList<Pojazd> pojazdy = new ArrayList<>();
    pojazdy.add(p1);
    pojazdy.add(p2);
    pojazdy.add(p3);
    pojazdy.add(p4);
    pojazdy.add(p5);

        System.out.println("-=-=- POJAZDY -=-=-");
        for (Pojazd pojazd: pojazdy){
            System.out.println(pojazdy);
            System.out.println();
        }


    // WYNAJMOWANIE POMIESZCZEŃ

        try {
            o1.wynajmijPomieszczenie(m1, 90);
            o2.wynajmijPomieszczenie(m2, 265);
            o2.wynajmijPomieszczenie(mp2, 365);
            o3.wynajmijPomieszczenie(m3, 60);
            o4.wynajmijPomieszczenie(m5, 180);
            o4.wynajmijPomieszczenie(mp4, 180);
            o5.wynajmijPomieszczenie(m5, 180);
            o5.wynajmijPomieszczenie(mp1, 180);

        } catch (ProblematicTenantException e) {
            e.getMessage();
        }

        // WKŁADANIE PRZEDMIOTÓW

        try{
            o2.wstawPrzedmiot(przedmiot1, mp2);
            o4.wstawPrzedmiot(przedmiot2, mp4);
            o5.wstawPrzedmiot(przedmiot3, mp1);

        }catch (Exception e){
            System.out.println("Nie możesz wstawić przedmiotu");
        }

        // WKŁADANIE POJAZDÓW

        try{
            o2.wstawPojazd(p1, mp2);
            o4.wstawPojazd(p2, mp4);
            o5.wstawPojazd(p4, mp1);

        }catch (Exception e){
            System.out.println("Nie możesz wstawić pojazdu");
        }

        zakończProgram(wątek1, wątek2);

        o1.zaloguj(mieszkańcy);  // wpisałam Osobę o1 dla przykładu; równie dobrze można wybrać dowolną osobę, a po "zalogowanie" nastąpi po podaniu poprawnego ID

    }

    public static void zakończProgram(Thread wątek){  // to właściwie nie ma żadnego zastosowania - wcześniej miałam wszystko w jednym wątku, ale za bardzo się przywiązałam do tej metody żeby teraz ją usunąć :)
        wątek.interrupt();
        System.out.println("Program został zakończony");
    }

    public static void zakończProgram(Thread wątek1, Thread wątek2){
        wątek1.interrupt();
        wątek2.interrupt();
        System.out.println("Program został zakończony");
    }
}