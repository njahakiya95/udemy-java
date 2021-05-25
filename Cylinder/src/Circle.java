public class Circle {
    //Class Instances
    private double radius;

    //Class Constructor
    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }

    //Class Methods
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (Math.pow(radius, 2) * Math.PI);
    }
}
