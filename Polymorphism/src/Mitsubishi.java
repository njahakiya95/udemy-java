public class Mitsubishi extends Car{

    //Mitsubishi class constructor
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    //Mitsubishi class methods
    @Override
    public String startEngine() {
        return "Mitsubishi -> engine starts.";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerating.";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> braking.";
    }
}
