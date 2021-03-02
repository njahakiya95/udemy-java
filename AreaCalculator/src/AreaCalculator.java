public class AreaCalculator {
    public static double Area(double radius) {
        if (radius < 0.0) {
            return -1.0;
        } else {
            return (Math.PI * radius * radius);
        }
    }

    public static double Area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            return (x * y);
        }
    }
}
