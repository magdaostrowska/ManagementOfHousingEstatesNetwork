package GUI_PROJEKT_1;

public class SamochódMiejski extends Pojazd implements PojazdJeżdżący{

    public String typPojazdu;

    public SamochódMiejski(String nazwa, double powierzchnia, String typPojazdu) {
        super(nazwa, powierzchnia);
        this.typPojazdu = typPojazdu;
    }


    @Override
    public void jedź() throws TooManyThingsException {

    }
}
