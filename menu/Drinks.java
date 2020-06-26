package menu;

public class Drinks {

    private String name;
    public static final Drinks coke = new Drinks("Coke");
    public static final Drinks lemonade = new Drinks("Lemonade");
    public static final Drinks sprite = new Drinks("Sprite");
    public static final Drinks water = new Drinks("Water");

    public Drinks(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}