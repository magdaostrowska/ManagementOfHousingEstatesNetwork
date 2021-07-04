package GUI_PROJEKT_1;

public class Mieszkanie extends Pomieszczenie{

    static int zmiennaPomocnicza = 1;
    int numerIdentyfikacyjny;

    public Mieszkanie (double powierzchniaUżytkowa){
        super(powierzchniaUżytkowa);
        //System.out.println("Powierzchnia użytkowa to: " + powierzchniaUżytkowa);
        //System.out.println("Numer identyfikacyjny mieszkania: " + numerIdentyfikacyjny);
        numerIdentyfikacyjny = zmiennaPomocnicza++;
    }

    @Override
    public String toString(){
        return ("Powierzchnia mieszkania: " + powierzchniaUżytkowa + "\nNumer identyfikacyjny: " + numerIdentyfikacyjny);
    }

}
