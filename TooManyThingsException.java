package GUI_PROJEKT_1;

public class TooManyThingsException extends Exception{

    public TooManyThingsException(){
        System.out.println("Remove some old items to insert a new item");
    }
}
