package burger_shop;

import java.util.*;

public class Order {

    private Burger burger;
    private Bread bread;
    private Meat meat;
    private Toppings t = new Toppings();
    private Sides sides = new Sides();
    private Drinks drinks = new Drinks();

    private Meal meal;

    private ArrayList<String> sidesList = new ArrayList<>();
    private ArrayList<String> drinkList = new ArrayList<>();
    private ArrayList<Burger> burgerList = new ArrayList<>();
    private ArrayList<Meal> mealList = new ArrayList<>();

    public Order(Burger burger, Bread bread, Meat meat) {
        this.burger = burger;
        this.bread = bread;
        this.meat = meat;

        burgerList.add(burger);

    }

    public Order(Meal meal) {
        this.meal = meal;

        mealList.add(meal);
    }

    // For changing toppings on a preset meal burger
    public void addToppings(Meal meal, int index) {
        meal.addTopping(index);

    }

    // For changing topics on just a burger
    public void addToppings(Burger burger, int index) {
        burger.addToppings(t, index);
    }

    public void addSides(int index) {
        sidesList.add(sides.getSides(index));
    }

    public void addDrinks(int index) {
        drinkList.add(drinks.getDrinks(index));
    }

    public void addBurger(String burgerType) {
        switch (burgerType) {
            case "Deluxe Burger":
                burgerList.add(new DeluxeBurger("Deluxe Burger", meat.getmeat(0), DeluxeBurger.burgerPrice(),
                        bread.getBread(0)));
                break;
            case "Health Burger":
                burgerList.add(
                        new HealthBurger("Health", meat.getmeat(0), HealthBurger.burgerPrice(), bread.getBread(0)));
                break;
            default:
                burgerList.add(new Burger("Plain", meat.getmeat(0), Burger.burgerPrice(), bread.getBread(0)));
                break;
        }
    }

    public double purchaseOrder() {
        double total = 0.00;
        for (Burger b : burgerList) {
            total += b.totalBurgerPrice();
        }
        for (Meal m : mealList) {
            total += m.mealTotal();
        }
        System.out.println("The total for you order is: " + total);
        return total;
    }
}
