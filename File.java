package GUI_PROJEKT_1;

public class File {

    Osoba najemca;
    Pomieszczenie pomieszczenie;

    public File(Osoba najemca, Pomieszczenie pomieszczenie){
        this.najemca = najemca;
        this.pomieszczenie = pomieszczenie;
    }

    @Override
    public String toString(){
        return "Najemca: " + najemca + "\nPomieszczenie: " + pomieszczenie;
    }
}
