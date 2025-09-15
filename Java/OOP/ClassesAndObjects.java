package Java.OOP;

class car {
    String brand;
    int year;

    void drive(){
        System.out.println(brand + year + " is driving!");
    }
}



public class ClassesAndObjects {
    public static void main(String[] args) {
        //Creating objects
        car mycar = new car();
        mycar.brand = "Toyota";
        mycar.year = 2023;

        mycar.drive();
    }
}
