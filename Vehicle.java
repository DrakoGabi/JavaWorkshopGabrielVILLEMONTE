
public class Vehicle {
    String model;
    int year;
    String brand;
    
    public Vehicle(String Model, int Year, String Brand) {
        model = Model;
        year = Year;
        brand = Brand;
    }
    
    public static void accelerate() {
        System.out.println("I'm putting the pedal to the metal");
    }
    
    public static void brake() {
        System.out.println("Woah! Slow down boy!");
    }
    
    public void describe() {
        System.out.println("I'm a " + brand+" " + model +" born in " +year);
    }
}
