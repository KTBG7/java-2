package menu;

import java.util.*;

public class DeluxeBurger extends Burger {
    private String name;
    private double price = 10.00;
    private Meat meat;
    private Bread bread;

    private ArrayList<Toppings> toppingsList = new ArrayList<>();

    public static final DeluxeBurger deluxe = new DeluxeBurger("Deluxe Burger", Meat.groundBeef, Bread.white);

    public DeluxeBurger(String name, Meat meat, Bread bread) {
        super(name, meat, bread);
        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }

    public void addTopping(Toppings topping) {
        try {
            if (toppingsList.size() < 6) {

                try {
                    // Checks for a duplicate topping, if it's a duplicate it wont add it
                    if (!checkToppingDupplicate(topping)) {
                        toppingsList.add(topping);
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Topping was already added! Cannot add duplicate toppings!");
                }
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Cannot add more than 2 toppings");
        }
    }

    private boolean checkToppingDupplicate(Toppings top) {
        for (Toppings t : toppingsList) {
            if (t.equals(top)) {
                return true;
            }
        }
        return false;
    }

    public double totalBurgerPrice() {
        price += toppingsList.size() * .50;

        return price;
    }

    @Override
    public String toString() {
        String burger;

        burger = "Burger: [name: " + name + ", price: " + price + ", bread: " + bread.getName() + ", meat: "
                + meat.getName() + ", toppings: ";

        for (Toppings top : toppingsList) {
            if (toppingsList.indexOf(top) == toppingsList.size() - 1) {
                burger += top.getName();
            } else {
                burger += top.getName();
                burger += ", ";
            }
        }
        burger += "]";
        return burger;
    }

    // private String name;

    // private String meat;

    // private double price;

    // private String bread;

    // private ArrayList<String> toppingList;

    // private int toppingsCounter = 0;

    // public DeluxeBurger(String name, String meat, double price, String bread) {
    // super(name, meat, price, bread);
    // this.name = name;
    // this.price = price;
    // this.bread = bread;
    // this.meat = meat;

    // toppingList = new ArrayList<>();
    // }

    // public static double burgerPrice() {
    // return 7.00;
    // }

    // public double totalBurgerPrice() {
    // price += toppingsCounter * 1.00;
    // return price;
    // }

    // public void addToppings(Toppings t, int index) {
    // try {
    // if (toppingsCounter < 6) {
    // if (!checkToppings(toppingList, t.getTopping(index))) {
    // toppingList.add(t.getTopping(index));
    // toppingsCounter++;
    // } else {
    // System.out.println("Topping already added! You can't add more than one!");
    // }
    // } else {
    // System.out.println("Cannot add more than 6 toppings.");
    // }
    // } catch (IndexOutOfBoundsException b) {
    // System.out.println("Invalid topping option.");
    // for (String s : t.getAllToppings()) {
    // System.out.println(s);
    // }
    // }
    // }

    // @Override
    // public String toString() {
    // String burger;

    // burger = "{Burger: " + name + ", meat: " + meat + ", price: " + price + ",
    // bread: " + bread + ", toppings: ";
    // for (String s : toppingList) {
    // burger += s;
    // burger += ", ";
    // }

    // burger += "}";
    // return burger;
    // }

    // private boolean checkToppings(ArrayList<String> list, String item) {

    // for (String s : list) {
    // if (s.equals(item)) {
    // return true;
    // }

    // }

    // return false;
    // }
}
