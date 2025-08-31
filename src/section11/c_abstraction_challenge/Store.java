package section11.c_abstraction_challenge;

import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> productsForSale = new ArrayList<>();
    public static void main(String[] args) {
        productsForSale.add(new MobilePhone("Nokia", 750.50, "Connecting People!"));
        productsForSale.add(new AirConditioner("WhirlPool", 300, "Cool summer like ever before!"));
        productsForSale.add(new Cushion("Sofa", 150, "We feel like lying in the Clouds!"));

        listProducts();

        ArrayList<OrderItem> blrBuyer = new ArrayList<>();
        addItemToOrderList(blrBuyer, 0, 15);
        addItemToOrderList(blrBuyer, 2, 20);

        printOrderedItems(blrBuyer);
    }
    public static void listProducts() {
        for (ProductForSale product : productsForSale) {
            System.out.println("-".repeat(60));
            product.showDetails();
        }
        System.out.println("-".repeat(60));
    }
    public static void addItemToOrderList(ArrayList<OrderItem> orderList, int orderId, int quantity) {
        orderList.add(new OrderItem(quantity, productsForSale.get(orderId)));
    }
    public static void printOrderedItems(ArrayList<OrderItem> orderItems) {
        System.out.printf("%-10s  %10s  %4s   %10s%n", "PRODUCT", "PRICE", "QNTY", "TOTAL");
        System.out.println("-".repeat(50));
        double salesTotal = 0;
        for (OrderItem item : orderItems) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.println("-".repeat(50));
        System.out.printf("%-33s %6.2f %n", "TOTAL COST:", salesTotal);
        System.out.println("-".repeat(50));
    }
}
