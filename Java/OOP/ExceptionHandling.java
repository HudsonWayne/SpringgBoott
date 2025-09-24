package Java.OOP;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10/0;
            
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Error: Can not devide by zero");

        }
    }
    
}
