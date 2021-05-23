public class Calculator {
    //Class variables
    private Floor floor;
    private Carpet carpet;

    //Class constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    //Class methods
    public double getTotalCost() {
        return (floor.getArea() * carpet.getCost());
    }
}
