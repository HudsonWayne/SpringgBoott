package Java.OOP;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("Error: Null value");
        }finally{
            System.out.println("This will always run");
        }
    }
}
