package ch04;

import java.util.Objects;

class Item {
    private String description;
    private double price;

    public Item(String description, double price){
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object otherObject) {
        // A quick test to see if the objects are identical
        if (this == otherObject) return true;

        // Must return false if the parameter is null
        if (otherObject == null) return false;

        // Check that otherObject is an item
        if (!(otherObject instanceof Item)) return false;
        //if (getClass() != otherObject.getClass()) return false;

        // Test whether the instance variables have identical values
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description)
                && price == other.price;
    }
}

class DiscountItem extends Item {
    private double discount;

    public DiscountItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object otherObject) {

        // Must return false if the parameter is null
        if (otherObject == null) return false;

        // Verify if the Item object is equal to the otherObject
        if (!super.equals(otherObject)) return false;

        // Verify if otherObject is not a DiscountedItem
        if (!(otherObject instanceof DiscountItem)) return true;

        DiscountItem other = (DiscountItem) otherObject;

        // Verify the DiscountItem objects are the same
        return (discount == other.discount);
    }
}

public class Exercise06 {
    public static void main(String[] args) {
        //Exercise #6
        System.out.println("Exercise #6");

        DiscountItem x = new DiscountItem("item1", 5.0, 3.0);
        Item y = new Item("item1", 5.0);
        DiscountItem z = new DiscountItem("item1", 5.0, 3.1);

        System.out.println("x.equals(y) = " + x.equals(y));
        System.out.println("y.equals(z) = " + y.equals(z));
        System.out.println("x.equals(z) = " + x.equals(z));
    }
}
