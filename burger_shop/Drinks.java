package burger_shop;

import java.util.*;

public class Drinks {

    ArrayList<String> drinksList;

    public Drinks() {
        drinksList = new ArrayList<>();

        drinksList.add("Water");
        drinksList.add("Gatorade");
        drinksList.add("Coke");
        drinksList.add("Fanta Orange");
        drinksList.add("Sprite");
        drinksList.add("Powerade");
        drinksList.add("Dr.Pepper");
    }

    public String getDrinks(int index) {
        return drinksList.get(index);
    }

    public ArrayList<String> getAllDrinks() {
        return drinksList;
    }

}