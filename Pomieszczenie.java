package GUI_PROJEKT_1;

import java.time.LocalDate;
import java.util.Comparator;

public class Pomieszczenie implements Comparable<Pomieszczenie>{


        double powierzchniaUżytkowa;
        static int zmiennaPomocnicza = 1;
        int numerIdentyfikacyjny;
        LocalDate dataRozpoczęciaNajmu;

        public Pomieszczenie (double powierzchniaUżytkowa){
            this.powierzchniaUżytkowa = powierzchniaUżytkowa; // podana w m3
            numerIdentyfikacyjny = zmiennaPomocnicza++;

        }


        public double getPowierzchniaUżytkowa(){
            return powierzchniaUżytkowa;
        }



    @Override
    public int compareTo(Pomieszczenie o) {
        return 0;
    }
}
