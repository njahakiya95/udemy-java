public class Point {

    //Class Variables
    private int x;
    private int y;

    //Class Constructors
    public Point() {
        //No args constructor
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Class Methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return (Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2)));
    }

    public double distance(int x, int y) {
        return (Math.sqrt(Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2)));
    }

    public double distance(Point xy) {
        return (distance(xy.getX(), xy.getY()));
    }
}
