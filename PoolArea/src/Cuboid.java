public class Cuboid extends Rectangle{
    //Class Instances
    private double height;

    //Class Constructors
    public Cuboid(double width, double length, double height) {
        super(width, length);
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
