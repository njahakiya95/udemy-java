public class Lamp {
    //Lamp class instances
    private String style;
    private boolean Battery;
    private int globRating;

    //Lamp class constructor
    public Lamp(String style, boolean Battery, int globRating) {
        this.style = style;
        this.Battery = Battery;
        this.globRating = globRating;
    }

    //Lamp class methods
    public void turnOn(){
        System.out.println("Lamp -> Turning On");
    }

    public String getStyle(){
        return style;
    }

    public boolean isBattery(){
        return Battery;
    }

    public int getGlobRating(){
        return globRating;
    }
}
