import java.util.ArrayList;
import java.util.LinkedList;

public interface VendingMachine {
    public void putHotProduct(ArrayList<HotDrink> item);

    

    public HotDrink getHotProduct(String a, Long b, int c);

}