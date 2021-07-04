package GUI_PROJEKT_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class SprWynajmu implements Runnable{

    Osoba o;
    Data d;
    Pomieszczenie p;


    @Override
    public void run() {
        try {

            while (true){
                if(d.data.isAfter(o.dataZakończeniaNajmuMieszkania)){
                    File file = new File(o, p);
                    ++o.liczbaPrzedawnień;
                }

                if (o.liczbaPrzedawnień>=3){
                    throw new ProblematicTenantException();
                }
                Thread.sleep(10000);
            }

        }   catch (InterruptedException | ProblematicTenantException | NullPointerException e){
            System.out.println("Przerwano wątek sprawdzający najem");
        }

}
}

