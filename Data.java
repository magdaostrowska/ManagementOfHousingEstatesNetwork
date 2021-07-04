package GUI_PROJEKT_1;
import java.time.LocalDate;

public class Data implements Runnable{

    public LocalDate data = LocalDate.now();
    Osoba o;
    Pomieszczenie p;


    @Override
    public void run() {

            try {
                while (true) {
                    System.out.println(data);
                    Thread.sleep(5000);
                    data = data.plusDays(1);

                    /*
                        if (data.isAfter(o.dataZakończeniaNajmuMieszkania)) {
                            File file = new File(o, p);
                            ++o.liczbaPrzedawnień;
                        }

                        if (o.liczbaPrzedawnień >= 3) {
                            throw new ProblematicTenantException();
                        }
                        Thread.sleep(10000);


                     */
                }
            } catch (InterruptedException e){
                System.out.println("Przerwano wątek zmieniający datę i sprawdzający najem");
                }

    }
}
