public class Wall {

    //Class Variables
    private double width;
    private double height;

    //Class Constructors
    public Wall() {
        //no args constructor
    }

    public Wall(double width, double height) {
        this.width = (width < 0.0) ? 0.0 : width;
        this.height = (height < 0.0) ? 0.0 : height;
    }

    //Class Methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    public double getArea() {
        return width * height;
    }
}
