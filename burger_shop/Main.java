package burger_shop;

public class Main {
    public static void main(String[] args) {
        // main execution of the burger shop goes here. This is the "entry point" of
        // your application
        Burger burger = new Burger("Plain", "beef", 4.50, "White");
        double price = burger.totalBurgerPrice();
        burger.addburgerTopping1("Tomato", .27);
    }
}
