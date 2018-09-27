import ch02.Invoice;

public class Exercise15 {
    public static void main(String[] args) {
        //Exercise #15
        System.out.println("Exercise #15");

        Invoice invoice = new Invoice();
        invoice.addItem("savon", 2, 3.90);
        invoice.addItem("brosse", 3, 1.99);
        invoice.printInvoice();
    }
}
