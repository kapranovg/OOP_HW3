import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class HotDrinkVendingMachine implements VendingMachine {

    private ArrayList<HotDrink> hotdrinks;

    @Override
    public void putHotProduct(ArrayList<HotDrink> item) {
        this.hotdrinks = item;
    }

    @Override
    public HotDrink getHotProduct(String a, Long b, int c) {
        for (HotDrink hotDrink : hotdrinks) {
            if (hotDrink.getName().equals(a)) {
                if (hotDrink.getVolume() == b) {
                    if (hotDrink.getTemperature() == c) {
                        hotdrinks.remove(hotDrink);
                        return hotDrink;
                    }
                }
            }
        }
        return null;

    }

    

    @Override
    public String toString() {

        return Arrays.toString(hotdrinks.toArray());
    }


}