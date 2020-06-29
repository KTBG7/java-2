package menu;

import java.util.*;

public class Meal {

    private String name;
    private Sides side;
    private Burger burger;
    private Drinks drink;
    private double price;

    private ArrayList<Sides> sidesList = new ArrayList<Sides>();

    public static final Meal valueMeal = new Meal("Value Meal", Sides.fries, Burger.plain, Drinks.coke, 7.00);
    public static final Meal healthyMeal = new Meal("Healthy Meal", Sides.salad, HealthBurger.health, Drinks.water,
            17.00);
    public static final Meal deluxeMeal = new Meal("Deluxe Meal", Sides.fries, DeluxeBurger.deluxe, Drinks.coke, 12.00);

    private Meal(String name, Sides side, Burger burger, Drinks drink, double price) {
        this.name = name;
        this.side = side;
        this.burger = burger;
        this.drink = drink;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Sides getSide() {
        return side;
    }

    public Burger getBurger() {
        return burger;
    }

    public Drinks getDrink() {
        return drink;
    }

    public double getPrice() {
        return price;
    }

    public void addSide(Sides side) {

        try {
            if (sidesList.size() < 3) {

                sidesList.add(side);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Cannot add more than 3 sides.");
        }
    }

    @Override
    public String toString() {
        String meal = "Meal [" + "name= '" + name + '\'' + ", side= " + side.getName() + ", ";
        for (Sides s : sidesList) {
            meal += s.getName();
            meal += ", ";
        }

        meal += "burger= " + burger + ", drink= " + drink.getName() + ", price= " + price + "]";

        return meal;
    }
}
