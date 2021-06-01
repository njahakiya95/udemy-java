public class Hamburger {

    //Hamburger class instances
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    //Hamburger class constructor
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    //Hamburger class methods
    public void addHamburgerAddition1(String name, double price) {
        addition1Price = price;
        addition1Name = name;
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Price = price;
        addition2Name = name;
    }

    public void addHamburgerAddition3(String name, double price) {
        addition3Price = price;
        addition3Name = name;
    }

    public void addHamburgerAddition4(String name, double price) {
        addition4Price = price;
        addition4Name = name;
    }

    public double itemizeHamburger() {
        System.out.println("One order of " + name + " on " + breadRollType + " with " + addition1Name + " " + addition2Name + " " + addition3Name + " " + addition4Name);
        return (price + addition1Price + addition2Price + addition3Price + addition4Price);
    }
}
