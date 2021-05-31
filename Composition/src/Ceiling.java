public class Ceiling {
    //Ceiling class instances
    private int height;
    private int paintedColor;

    //Ceiling class constructor
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    //Ceiling class methods
    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}