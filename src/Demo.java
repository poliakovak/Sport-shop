import purchases.Purchase;
import purchases.PurchaseBuilder;

public class Demo {

    public static void main(String[] args) {

        PurchaseBuilder purchaseBuilder = new PurchaseBuilder();

        Purchase purchaseA = purchaseBuilder.createPurchaseA();
        System.out.print("Заказ А\n\n");
        purchaseA.printPurchase();
        System.out.printf("Общая стоимость: %.2f\n\n", purchaseA.getSum());

        Purchase purchaseB = purchaseBuilder.createPurchaseB();
        System.out.print("Заказ B\n\n");
        purchaseB.printPurchase();
        System.out.printf("Общая стоимость: %.2f\n\n", purchaseB.getSum());


    }
}
