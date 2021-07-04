package GUI_PROJEKT_1;

public class Motocykl extends Pojazd implements PojazdJeżdżący{

    public int liczbaKół;


    public Motocykl(String nazwa, double powierzchnia, int liczbaKół) {
        super(nazwa, powierzchnia);
        this.liczbaKół = liczbaKół;
    }


    @Override
    public void jedź() throws TooManyThingsException {

    }
}
