package burger_shop;

import java.util.ArrayList;

public class Bread {
    private ArrayList<String> breadTypes;

    public Bread() {
        breadTypes = new ArrayList<>();

        breadTypes.add("Rye");
        breadTypes.add("White");
        breadTypes.add("Wheat");
        breadTypes.add("Rosemary Cheddar");
        breadTypes.add("Sourdough");

    }

    public ArrayList<String> getAllBread() {
        return breadTypes;
    }

    public String getBread(int index) {
        return breadTypes.get(index);
    }
}
