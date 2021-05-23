public class Floor {
    //Class variables
    private double width;
    private double length;

    //Class constructor
    public Floor(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    //Class methods
    public double getArea() {
        return (this.width * this.length);
    }
}
