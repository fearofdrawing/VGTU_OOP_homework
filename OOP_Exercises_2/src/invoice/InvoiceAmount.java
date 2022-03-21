package invoice;

public class InvoiceAmount {
    public static int getInvoiceAmount(Invoice invoice) {

        int quantity = invoice.getItemQuantity();
        int price = invoice.getItemPrice();

        int amount = quantity * price;

        return amount;
    }

}
