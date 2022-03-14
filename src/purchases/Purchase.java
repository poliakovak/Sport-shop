package purchases;

import items.Item;
import java.util.ArrayList;
import java.util.List;

public class Purchase {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getSum() {
        double sum = 0;

        for (Item item : items) {
            sum += item.price();
        }
        return sum;
    }

    public void printPurchase() {

        for (Item item : items) {
            System.out.println("Название: " + item.name());
            System.out.println("Фирма изготовитель: " + item.brand().printBrand());
            System.out.println("Цена: " + item.price());
            System.out.println("--------------------------------------");
        }
    }
}
