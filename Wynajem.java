package GUI_PROJEKT_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wynajem {

    File plik = new File("Wynajęte mieszkania.txt");

    Scanner odczyt;

    {
        try {
            Scanner in = new Scanner(plik);
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");
        }
    }
}
