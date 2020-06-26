package burger_shop;

import menu.*;

import java.util.*;

public class Order {

    private Burger burger;
    private Bread bread;
    private Meat meat;
    private Meal meal;

    private ArrayList<Sides> sidesList = new ArrayList<>();
    private ArrayList<Drinks> drinkList = new ArrayList<>();
    private ArrayList<Burger> burgerList = new ArrayList<>();
    private ArrayList<Meal> mealList = new ArrayList<>();
    private ArrayList<Toppings> toppingsList = new ArrayList<>();

    public Order(Burger burger, Bread bread, Meat meat) {
        this.burger = burger;
        this.bread = bread;
        this.meat = meat;

        burgerList.add(burger);

    }

    public Order(Meal meal) {
        this.meal = meal;
    }

    // For changing toppings on a preset meal burger
    public void addToppings(Toppings one, Toppings two, Toppings three, Toppings four) {
        toppingsList.add(one);
        toppingsList.add(two);
        toppingsList.add(three);
        toppingsList.add(four);

    }

    public void addToppings(Toppings one, Toppings two, Toppings three) {
        toppingsList.add(one);
        toppingsList.add(two);
        toppingsList.add(three);
    }

    public void addToppings(Toppings one, Toppings two) {
        toppingsList.add(one);
        toppingsList.add(two);
    }

    public void addToppings(Toppings one) {
        toppingsList.add(one);
    }

    public void addSides(Sides one, Sides two, Sides three, Sides four) {
        sidesList.add(one);
        sidesList.add(two);
        sidesList.add(three);
        sidesList.add(four);
    }

    public void addSides(Sides one, Sides two, Sides three) {
        sidesList.add(one);
        sidesList.add(two);
        sidesList.add(three);
    }

    public void addSides(Sides one, Sides two) {
        sidesList.add(one);
        sidesList.add(two);
    }

    public void addSides(Sides one) {
        sidesList.add(one);

    }

    public void addDrinks(Drinks drink) {
        drinkList.add(drink);
    }

    public void addBurger(Burger burger) {
        burgerList.add(burger);
    }

    public void addHealthyBurger(HealthBurger burger) {
        burgerList.add(burger);
    }

    public void addDeluxeBurger(DeluxeBurger burger) {
        burgerList.add(burger);
    }

    public void addMeal(Meal meal) {
        mealList.add(meal);
    }

    public double purchaseOrder() {
        double orderTotal = 0;

        try {
            orderTotal += meal.getPrice();
        } catch (NullPointerException npe) {

        }

        try {
            orderTotal += burger.totalBurgerPrice();
        } catch (NullPointerException npe) {

        }

        for (Burger b : burgerList) {
            orderTotal += b.totalBurgerPrice();
        }

        for (Toppings t : toppingsList) {
            orderTotal += 0.50;
        }

        for (Sides s : sidesList) {
            orderTotal += 1.00;
        }

        for (Drinks d : drinkList) {
            orderTotal += 1.00;
        }
        for (Meal m : mealList) {
            orderTotal += m.getPrice();
        }

        return orderTotal;
    }
}
