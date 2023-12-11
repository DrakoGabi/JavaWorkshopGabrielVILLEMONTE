
public class Truck extends Vehicle {
    public Truck (String Model, int Year, String Brand, int Weight, String Wheels) {
        super(model, year, brand);
        weight = Weight;
        wheels = Wheels;
    }
    public void describe() {
        super();
        System.out.println("I'm a Truck  i weight"+weight +"kg and i have" +wheels);
    }
}
