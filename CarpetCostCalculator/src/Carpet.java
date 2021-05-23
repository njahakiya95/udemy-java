public class Carpet {
    //Class variables
    private double cost;

    //Class constructor
    public Carpet(double cost) {
        this.cost = (cost < 0) ? 0 : cost;
    }

    //Class methods
    public double getCost() {
        return this.cost;
    }
}
