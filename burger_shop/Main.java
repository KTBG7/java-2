package burger_shop;

import menu.*;

/*

DID PAIR PROGRAMMING WITH:
CALEB WATERS
TYLER CLEMENTS

*/

public class Main {
    public static void main(String[] args) {
        // main execution of the burger shop goes here. This is the "entry point" of
        // your application
        Order order1 = new Order(Meal.deluxeMeal);
        order1.addBurger(Burger.plain);
        order1.addSides(Sides.applePie, Sides.fries);
        System.out.println(order1.purchaseOrder());

        Order order2 = new Order(Meal.healthyMeal);
        order2.addHealthyBurger(HealthBurger.health);
        HealthBurger.health.addToppings(Toppings.cheese);
        System.out.println(order2.purchaseOrder());
    }

}
