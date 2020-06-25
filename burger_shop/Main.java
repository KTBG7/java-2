package burger_shop;

/*

DID PAIR PROGRAMMING WITH:
CALEB WATERS
TYLER CLEMENTS

*/

public class Main {
    public static void main(String[] args) {
        // main execution of the burger shop goes here. This is the "entry point" of
        // your application
        Meal m1 = new Meal();
        m1.newBasicMeal();
        System.out.println(m1.getCurrentMeal());

        Order order1 = new Order(m1);
        order1.purchaseOrder();
    }

}
