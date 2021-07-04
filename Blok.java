package GUI_PROJEKT_1;

public class Blok {

    int liczbaMieszkań;
    int numerBloku;
    String adres;
    Mieszkanie [] tabMieszkania;

    public Blok (int liczbaMieszkań, int numerBloku){
        this.liczbaMieszkań = liczbaMieszkań;
        this.numerBloku = numerBloku;
        tabMieszkania = new Mieszkanie[liczbaMieszkań];
    }

    public String dodajAdres(String adres){
        return adres;
    }

    @Override
    public String toString(){
        return "Blok numer: " + numerBloku + "\nLiczba mieszkań " + liczbaMieszkań;
    }
}
