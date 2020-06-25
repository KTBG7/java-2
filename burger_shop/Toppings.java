package burger_shop;

import java.util.*;

public class Toppings {
    ArrayList<String> toppingsList;

    public Toppings() {
        toppingsList = new ArrayList<>();

        toppingsList.add("Tomatoes");
        toppingsList.add("Lettuce");
        toppingsList.add("Mustard");
        toppingsList.add("Ketchup");
        toppingsList.add("Mayo");
        toppingsList.add("Onions");
        toppingsList.add("Cheese");
    }

    public String getTopping(int index) {
        return toppingsList.get(index);
    }

    public ArrayList<String> getAllToppings() {
        return toppingsList;
    }

    public ArrayList<String> getUnhealthyToppings() {
        ArrayList<String> unHealthyToppingsList = new ArrayList<>();

        for (String s : toppingsList) {
            if (s.equals("Mustard") || s.equals("Ketchup") || s.equals("Mayo") || s.equals("Cheese")) {
                unHealthyToppingsList.add(s);
            }
        }
        return unHealthyToppingsList;
    }

    public ArrayList<String> getHealthyToppings() {
        ArrayList<String> healthyToppingsList = new ArrayList<>();

        for (String s : toppingsList) {
            if (s.equals("Lettuce") || s.equals("Onions") || s.equals("Tomatoes")) {
                healthyToppingsList.add(s);
            }
        }
        return healthyToppingsList;
    }

}