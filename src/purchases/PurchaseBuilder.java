package purchases;

import items.BlackCap;
import items.BlueTShirt;
import items.RedTShirt;
import items.WhiteCap;

public class PurchaseBuilder {

    public Purchase createPurchaseA() {

        Purchase purchase = new Purchase();
        purchase.addItem(new RedTShirt());
        purchase.addItem(new WhiteCap());
        return purchase;
    }

    public Purchase createPurchaseB() {

        Purchase purchase = new Purchase();
        purchase.addItem(new BlueTShirt());
        purchase.addItem(new BlackCap());
        return purchase;
    }
}
