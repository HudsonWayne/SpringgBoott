package Java.OOP;
class Car{
    String brand;
    int year;

    void drive(){
        System.out.println(brand + "is driving");
    }

}

public class ClasesObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.year = 2022;

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.year = 2022;

    }
    
}
