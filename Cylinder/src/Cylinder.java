public class Cylinder extends Circle{
    //Class Instances
    private double height;

    //Class Constructor
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height < 0) ? 0 : height;
    }

    //Class Methods
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return (getArea() * height);
    }
}
