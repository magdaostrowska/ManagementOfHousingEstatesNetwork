package GUI_PROJEKT_1;

public class Osiedle {

    int liczbaBloków;
    String nazwaOsiedla;
    Blok [] tabOsiedle;

    public Osiedle(String nazwaOsiedla, int liczbaBloków){
        this.nazwaOsiedla = nazwaOsiedla;
        this.liczbaBloków = liczbaBloków;
        tabOsiedle = new Blok [liczbaBloków];
    }
}
