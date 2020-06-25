package burger_shop;

import java.util.*;

public class Burger {
    private String name;

    private Meat meat;

    private double price;

    private String bread;

    private String topping1Name;

    private double topping1Price;

    private String topping2Name;

    private double topping2Price;

    private String topping3Name;

    private double topping3Price;

    private String topping4Name;

    private double topping4Price;

    public Burger(String name, Meat meat, double price, String bread) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bread = bread;
    }

    public void addburgerTopping1(String name, double price) {
        this.topping1Name = name;
        this.topping1Price = price;
    }

    public void addburgerTopping2(String name, double price) {
        this.topping2Name = name;
        this.topping2Price = price;
    }

    public void addburgerTopping3(String name, double price) {
        this.topping3Name = name;
        this.topping3Price = price;
    }

    public void addburgerTopping4(String name, double price) {
        this.topping4Name = name;
        this.topping4Price = price;
    }

    public double plainBurgerPrice() {
        System.out.println("Wow you're no fun! Oh well... The price of a plain " + this.meat + " burger on "
                + this.bread + " bread is " + this.price);
        return this.price;
    }

    public double totalBurgerPrice() {
        double burgerPrice = this.price;
        System.out.println(this.name + " burger " + "with " + this.meat + " on " + this.bread + " bread " + "costs "
                + this.price + ".");
        if (this.name != "Plain" && this.topping1Name != null) {
            burgerPrice += this.topping1Price;
            System.out.println(this.topping1Name + " has been added at an additional cost of " + this.topping1Price);
        } else if (this.name == "Plain" && this.topping1Name != null) {
            System.out.println("Are you crazy?! You can't ask for a plain burger and then try to add toppings!");
        } else if (this.name.contains("Plain")) {
            return plainBurgerPrice();
        }
        if (this.name != "Plain" && this.topping2Name != null) {
            burgerPrice += this.topping2Price;
            System.out.println(this.topping2Name + " has been added at an additional cost of " + this.topping2Price);
        } else if (this.topping2Name != null) {
            System.out.println("Are you crazy?! You can't ask for a plain burger and then try to add toppings!");
        }
        if (this.name != "Plain" && this.topping3Name != null) {
            burgerPrice += this.topping3Price;
            System.out.println(this.topping3Name + " has been added at an additional cost of " + this.topping3Price);
        } else if (this.topping3Name != null) {
            System.out.println("Are you crazy?! You can't ask for a plain burger and then try to add toppings!");
        }
        if (this.name != "Plain" && this.topping4Name != null) {
            burgerPrice += this.topping4Price;
            System.out.println(this.topping4Name + " has been added at an additional cost of " + this.topping4Price);
        } else if (this.topping4Name != null) {
            System.out.println("Are you crazy?! You can't ask for a plain burger and then try to add toppings!");
        }

        return burgerPrice;

    }
}
