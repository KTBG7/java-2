package burger_shop;

import java.util.*;

public class Meal {

    Toppings t = new Toppings();

    Meat m = new Meat();

    Bread br = new Bread();

    Sides s = new Sides();

    Drinks d = new Drinks();

    Burger b;

    ArrayList<String> sideList;

    int sideCounter = 1;

    String drink = "";

    public Meal() {
        t = new Toppings();
        m = new Meat();
        br = new Bread();
        s = new Sides();
        d = new Drinks();
        b = new Burger();
        sideList = new ArrayList<>();

    }

    public void newBasicMeal() {
        b = new Burger("Healthy Burger", m.getmeat(3), Burger.burgerPrice(), br.getBread(4));
        sideList.add(s.getSides(0));
        drink = "Coke";
    }

    public void newHealthyMeal() {
        b = new HealthBurger("Healthy Burger", m.getmeat(3), HealthBurger.burgerPrice(), br.getBread(4));
        sideList.add(s.getSides(0));
        drink = "Water";
    }

    public void newDeluxeMeal() {
        b = new DeluxeBurger("Deluxe Burger", m.getmeat(3), DeluxeBurger.burgerPrice(), br.getBread(4));
        sideList.add(s.getSides(0));
        drink = "Coke";
    }

    public void addTopping(int index) {
        b.addToppings(t, index);
    }

    public void addSide(int index) {

        try {
            if (sideCounter <= 3) {
                sideList.add(s.getSides(index));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Option\nAvailable options: ");
            for (String str : s.getAllsides()) {
                System.out.println(str);
            }
        }
    }

    public void changeDrink(int index) {
        drink = d.getDrinks(index);
    }

    public String getCurrentMeal() {
        String currentMeal = b.toString() + " | Sides: ";

        for (String str : sideList) {
            currentMeal += str;
            currentMeal += ", ";
        }
        currentMeal += "} | Drink: " + drink;

        return currentMeal;
    }

    public double mealTotal() {
        return b.totalBurgerPrice();
    }
}
