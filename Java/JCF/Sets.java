package Java.JCF;

import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);

        for (int num : numbers){
            System.out.println(num);
        }

    }
    
}
