package GUI_PROJEKT_1;
import java.lang.Math;

public class Przedmiot implements Comparable<Przedmiot>{

    double powierzchnia;
    String nazwa;
    int zmienna = 0;

    public Przedmiot (String nazwa, double powierzchnia){
        this.powierzchnia = powierzchnia;
        this.nazwa = nazwa;

    }

    public double getPowierzchnia(){
        return powierzchnia;
    }

    public String getNazwa(){
        return nazwa;
    }

    @Override
    public String toString(){
        return "Przedmiot: " + nazwa + "\nPowierzchnia: " + powierzchnia;
    }


    @Override
    public int compareTo(Przedmiot p) {
        /*

        int zmienna = getPowierzchnia().compareTo(p.getPowierzchnia());
        if (zmienna == 0){
            zmienna = getNazwa().compareTo(p.getNazwa());
        }
        return zmienna;

        */


        return 0;
    }
}
