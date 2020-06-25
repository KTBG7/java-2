package burger_shop;

import java.util.ArrayList;

public class Meat {
    private ArrayList<String> meatTypes;

    public Meat() {
        meatTypes = new ArrayList<>();

        meatTypes.add("Ground Beef");
        meatTypes.add("Ground Turkey");
        meatTypes.add("Steak");
        meatTypes.add("Black Bean");
        meatTypes.add("Impossible");
        meatTypes.add("Chicken");

    }

    public ArrayList<String> getAllMeat() {
        return meatTypes;
    }

    public String getmeat(int index) {
        return meatTypes.get(index);
    }
}