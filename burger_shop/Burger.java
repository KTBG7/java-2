package burger_shop;

import java.util.*;

public class Burger {
    private String name;

    private String meat;

    private double price;

    private String bread;

    private ArrayList<String> toppingList;

    private int toppingsCounter = 0;

    public Burger(String name, String meat, double price, String bread) {
        this.name = name;
        this.price = price;
        this.bread = bread;
        this.meat = meat;

        toppingList = new ArrayList<>();
    }

    public Burger() {

    }

    public static double burgerPrice() {
        return 4.50;
    }

    public double totalBurgerPrice() {
        price += toppingsCounter * 0.50;
        return price;
    }

    public void addToppings(Toppings t, int index) {
        try {
            if (toppingsCounter < 2) {

                if (!checkToppings(toppingList, t.getTopping(index))) {
                    toppingList.add(t.getTopping(index));
                    toppingsCounter++;
                } else {
                    System.out.println("Topping already added! You can't add more than one!");
                }
            } else {
                System.out.println("Cannot add more than 2 toppings.");
            }
        } catch (IndexOutOfBoundsException b) {
            System.out.println("Invalid topping option.");
            for (String s : t.getAllToppings()) {
                System.out.println(s);
            }
        }
    }

    private boolean checkToppings(ArrayList<String> list, String item) {

        for (String s : list) {
            if (s.equals(item)) {
                return true;
            }

        }

        return false;
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

}
