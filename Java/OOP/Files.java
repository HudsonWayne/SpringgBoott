package Java.OOP;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner reader = new Scanner (file);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
