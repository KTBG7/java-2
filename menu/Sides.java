package menu;

public class Sides {

    private String name;

    public static final Sides applePie = new Sides("Apple Pie");
    public static final Sides salad = new Sides("Salad");
    public static final Sides banana = new Sides("Banana");
    public static final Sides cookies = new Sides("Cookies");
    public static final Sides orange = new Sides("Orange");
    public static final Sides fries = new Sides("Fries");

    private Sides(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
