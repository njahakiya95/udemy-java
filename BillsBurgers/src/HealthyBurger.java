public class HealthyBurger extends Hamburger {

    //HealthyBurger class instances
    private String healthyExtra1Name;
    private String healthyExtra2Name;

    private double healthyExtra1Price;
    private double healthyExtra2Price;

    //HealthyBurger class constructor
    public HealthyBurger(String meat, double price) {
        super("Beyond Burger", meat, price, "Honeywheat Bread");
    }

    //HealthyBUrger class methods
    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("One order of Beyond Burger on Honeywheat Bread with " + healthyExtra1Name + " " + healthyExtra2Name);
        return (super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price);
    }
}