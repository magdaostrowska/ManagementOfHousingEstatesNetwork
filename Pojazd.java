package GUI_PROJEKT_1;

public abstract class Pojazd {

    String nazwa;
    double powierzchnia;

    public Pojazd (String nazwa, double powierzchnia){
        this.nazwa = nazwa;
        this.powierzchnia = powierzchnia;
    }

    public String toString(){
        return "Nazwa pojazdu: " + nazwa + "\nZajmowana powierzchnia: " + powierzchnia;
    }

}
