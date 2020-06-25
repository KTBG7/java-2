package burger_shop;

import java.util.*;

public class Sides {

    ArrayList<String> sidesList;

    public Sides() {
        sidesList = new ArrayList<>();

        sidesList.add("Chips");
        sidesList.add("Apple Pie");
        sidesList.add("Banana");
        sidesList.add("Apple");
        sidesList.add("Orange");
        sidesList.add("Salad");
        sidesList.add("Fries");
    }

    public String getSides(int index) {
        return sidesList.get(index);
    }

    public ArrayList<String> getAllsides() {
        return sidesList;
    }

}
