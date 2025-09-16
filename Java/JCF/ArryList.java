package Java.JCF;
import java.util.ArrayList;

public class ArryList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Wayne");
        names.add("Tanaka");
        names.add("Hudson");

        System.out.println(names.get(0));

        for (String name : names){
            System.out.println(names);
        }
    }
    
}
