package menu;

public class Meat {
    private String name;

    public static final Meat groundBeef = new Meat("Ground Beef");
    public static final Meat groundTurkey = new Meat("Ground Turkey");
    public static final Meat chicken = new Meat("Chicken");
    public static final Meat blackBean = new Meat("Black Bean");
    public static final Meat impossible = new Meat("Impossible Burger");

    private Meat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}