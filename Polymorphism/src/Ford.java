public class Ford extends Car{

    //Ford class constructor
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    //Ford class methods
    @Override
    public String startEngine() {
        return "Ford -> engine starts.";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerating.";
    }

    @Override
    public String brake() {
        return "Ford -> braking.";
    }
}