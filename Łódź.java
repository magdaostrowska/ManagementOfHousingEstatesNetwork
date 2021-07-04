package GUI_PROJEKT_1;

public class Łódź extends Pojazd implements PojazdPływający{

    public int liczbaŻagli;

    public Łódź(String nazwa, double powierzchnia, int liczbaŻagli) {
        super(nazwa, powierzchnia);
        this.liczbaŻagli = liczbaŻagli;
    }

    @Override
    public void płyń() throws TooManyThingsException {
    }
}
