package menu;

import java.util.ArrayList;

public class Burger {
    private String name;
    private double price = 5.00;
    private Meat meat;
    private Bread bread;

    private ArrayList<Toppings> toppingsList = new ArrayList<>();

    public static final Burger plain = new Burger("Plain Burger", Meat.groundBeef, Bread.white);

    public Burger(String name, Meat meat, Bread bread) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }

    public void addTopping(Toppings topping) {
        try {
            if (toppingsList.size() < 2) {

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
}
