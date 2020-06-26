package menu;

public class Toppings {
    private String name;
    private boolean healthy;

    public static final Toppings tomatoes = new Toppings("Tomatoes", true);
    public static final Toppings onions = new Toppings("Onions", true);
    public static final Toppings mayo = new Toppings("Mayo", false);
    public static final Toppings ketchup = new Toppings("Ketchup", false);
    public static final Toppings cheese = new Toppings("Cheese", false);
    public static final Toppings lettuce = new Toppings("Lettuce", true);

    private Toppings(String name, boolean healthy) {
        this.name = name;
        this.healthy = healthy;
    }

    public String getName() {
        return name;
    }

    public boolean getHealthy() {
        return healthy;
    }
}