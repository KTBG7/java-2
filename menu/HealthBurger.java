package menu;

import java.util.*;

public class HealthBurger extends Burger {

    private String name;
    private double price = 15.00;
    private Meat meat;
    private Bread bread;
    private Toppings topping;

    private ArrayList<Toppings> toppingsList = new ArrayList<>();

    public static final HealthBurger health = new HealthBurger("Health Burger", Meat.blackBean, Bread.wheat);

    public HealthBurger(String name, Meat meat, Bread bread) {
        super(name, meat, bread);
        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }

    public void addToppings(Toppings topping) {
        try {
            if (toppingsList.size() < 4) {

                try {
                    // Check for a topping duplicate - if there is a duplicate, don't add the
                    // requested topping
                    if (!checkToppingDuplicate(topping) && checkToppingHealthy(topping)) {
                        toppingsList.add(topping);
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println(
                            "Topping already added or it is unhealthy! Cannot add duplicate or unhealthy toppings. ");
                }
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Cannot add more than 2 toppings.");
        }
    }

    private boolean checkToppingHealthy(Toppings top) {
        return top.getHealthy();
    }

    private boolean checkToppingDuplicate(Toppings top) {
        for (Toppings t : toppingsList) {
            if (t.equals(top)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Meat getMeat() {
        return meat;
    }

    public Bread getBread() {
        return bread;
    }

    public Toppings getToppings() {
        return topping;
    }

    public ArrayList<Toppings> getToppingsList() {
        return toppingsList;
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
