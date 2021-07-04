package GUI_PROJEKT_1;


public class ProblematicTenantException extends Exception{

    public ProblematicTenantException(){
        System.out.println("Osoba " + " "  + " posiadała już najem pomieszczeń: ...");
    }
}
