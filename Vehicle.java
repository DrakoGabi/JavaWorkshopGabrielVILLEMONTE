
public class Vehicle {
    String model;
    int year;
    String brand;
    int weight;
    String wheels;
    public Vehicle(String Model, int Year, String Brand, int Weight, String wheels) {
        model = Model;
        year = Year;
        brand = Brand;
        weight = Weight;
        wheels = Wheels;
    }
    public static void accelerate() {
        System.out.println("I'm putting the pedal to the metal");        
    }
    public static void brake() {
        System.out.println("Woah! Slow down boy!");
        }
    public void describe() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
        System.out.println(weight);
        System.out.println(wheels);
    }
}
