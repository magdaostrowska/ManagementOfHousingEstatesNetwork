package GUI_PROJEKT_1;

public class SamochódTerenowy extends Pojazd implements PojazdJeżdżący{

    public int liczbaKółZapasowych;

    public SamochódTerenowy(String nazwa, double powierzchnia, int liczbaKółZapasowych) {
        super(nazwa, powierzchnia);
        this.liczbaKółZapasowych = liczbaKółZapasowych;
    }

    @Override
    public void jedź() throws TooManyThingsException {

    }
}
