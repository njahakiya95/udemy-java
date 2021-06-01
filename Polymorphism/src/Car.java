public class Car {

    //Car instances
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    //Car class constructor
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    //Car class methods
    public String startEngine() {
        return "Car -> engine starts.";
    }
    public String accelerate() {
        return "Car -> accelerating.";
    }
    public String brake() {
        return "Car -> braking.";
    }
    public int getCylinders() {
        return cylinders;
    }
    public String getName() {
        return name;
    }
}
