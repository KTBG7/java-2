package menu;

public class Bread {
    private String name;

    public static final Bread wheat = new Bread("Wheat");
    public static final Bread white = new Bread("White");
    public static final Bread sourdough = new Bread("Sourdough");
    public static final Bread italian = new Bread("Italian");

    public Bread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
