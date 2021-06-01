public class Holden extends Car{

    //Holden class constructor
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    //Holden class methods
    @Override
    public String startEngine() {
        return "Holden -> engine starts.";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerating.";
    }

    @Override
    public String brake() {
        return "Holden -> braking.";
    }
}