package Java.JCF.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitals = new LinkedHashMap();
        capitals.put("Zimbabwe", "Harare");
        capitals.put("South Africa", "Pretoria");
        capitals.pot("Kenya", "Nairobi");

        System.out.println(capitals);
    }
}
