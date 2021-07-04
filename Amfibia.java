package GUI_PROJEKT_1;

public class Amfibia extends Pojazd implements PojazdJeżdżący, PojazdPływający{

    boolean długośćGąsiennic;


    public Amfibia(String nazwa, double powierzchnia, boolean długośćGąsiennic) {
        super(nazwa, powierzchnia);
        this.długośćGąsiennic = długośćGąsiennic;
    }


    @Override
    public void płyń() throws TooManyThingsException {

    }

    @Override
    public void jedź() throws TooManyThingsException {

    }
}
