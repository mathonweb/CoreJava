package ch02;

import java.util.ArrayList;

public class Invoice {
    private static class Item { // Item is nested inside Invoice
        String description;
        int quantity;
        double unitPrice;

        double price() {return quantity * unitPrice;}
    }

    public void addItem(String description, int quantity, double unitPrice){
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    public void printInvoice(){
        System.out.println("Description  Quantity  unitPrice");
        for(int i = 0; i < items.size(); i++ ){
            System.out.printf("%11s", items.get(i).description);
            System.out.printf("%10d", items.get(i).quantity);
            System.out.printf("%11.2f", items.get(i).unitPrice);
            System.out.println();
        }
    }

    private ArrayList<Item> items = new ArrayList<>();
}
