package burger_shop;

import java.util.*;

public class HealthBurger extends Burger {

    private String name;

    private String meat;

    private double price;

    private String bread;

    private ArrayList<String> toppingList;

    private int toppingsCounter = 0;

    public HealthBurger(String name, String meat, double price, String bread) {
        super(name, meat, price, bread);
        this.name = name;
        this.price = price;
        this.bread = bread;
        this.meat = meat;

        toppingList = new ArrayList<>();
    }

    public static double burgerPrice() {
        return 9;
    }

    public double totalBurgerPrice() {
        price += toppingsCounter * 1.00;
        return price;
    }

    public void addToppings(Toppings t, int index) {

        ArrayList<String> healthyOptions = new ArrayList<>();
        healthyOptions = t.getHealthyToppings();
        try {
            if (toppingsCounter < 4) {
                if (!checkToppings(toppingList, healthyOptions.get(index))) {
                    toppingList.add(healthyOptions.get(index));
                    toppingsCounter++;
                } else {
                    System.out.println("Topping already added! You can't add more than one!");
                }
            } else {
                System.out.println("Cannot add more than 4 toppings.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Option\nAvailable options: ");
            for (String s : healthyOptions) {
                System.out.println(s);
            }
        }

    }

    @Override
    public String toString() {
        String burger;

        burger = "{Burger: " + name + ", meat: " + meat + ", price: " + price + ", bread: " + bread + ", toppings: ";
        for (String s : toppingList) {
            burger += s;
            burger += ", ";
        }

        burger += "}";
        return burger;
    }

    private boolean checkToppings(ArrayList<String> list, String item) {

        for (String s : list) {
            if (s.equals(item)) {
                return true;
            }

        }

        return false;
    }
}
