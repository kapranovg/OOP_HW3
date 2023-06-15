import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод 
// getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
// Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
// Добавить к торговому аппарату с горячими напитками Comparable(сортировку по ценам, цены должны быть типа Long)

public class program {
    public static void main(String[] args) {

        HotDrink coffee = new HotDrink("nescafe", (long) 10, 100);
        HotDrink cacao = new HotDrink("nesquik", (long) 5, 80);
        HotDrink tea = new HotDrink("greenfield", (long) 4 , 95);
        HotDrink irish_cofee = new HotDrink("pureIrishCoffee", (long) 6, 90);
        ArrayList<HotDrink> hotDrinks = new ArrayList<>();
        hotDrinks.add(coffee);
        hotDrinks.add(cacao);
        hotDrinks.add(tea);
        hotDrinks.add(irish_cofee);
                
        HotDrinkVendingMachine hdvm = new HotDrinkVendingMachine();
        hdvm.putHotProduct(hotDrinks);
        
        System.out.println(("///////"));
        System.out.println(("Initial HotDrinkVendingMachine"));
        System.out.println((hdvm));
        System.out.println(("///////"));
        Collections.sort(hotDrinks);
        System.out.println(("Sorted HotDrinkVendingMachine"));
        System.out.println((hdvm));




    }
}