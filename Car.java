
public class Car extends Vehicle {
    int weight;
    String wheels;

    public Car (String Model, int Year, String Brand, int Weight, String Wheels) {
        super(Model, Year, Brand);
        weight = Weight;
        wheels = Wheels;
    }
    public static void  accelerate(String Onoma) {
        System.out.println("i make this noise :" +Onoma);
    }
    public void describe() {
        super.describe();
        System.out.println("I'm a Car je pèse" + weight+ wheels);
    }
    public void WeightSetter(int NewW) {
        weight = NewW;
    }
    public void WheelsSetter(String NewR) {
        wheels = NewR;
    }
    public int WeightGetter() {
        return weight;
    }
    public String WheelsGetter() {
        return wheels;
    }
}
