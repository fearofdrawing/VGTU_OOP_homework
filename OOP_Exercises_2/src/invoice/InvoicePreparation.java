package invoice;

import java.util.Scanner;

public class InvoicePreparation {

    static String number;
    static String description;
    static int quantity;
    static int price;

    private static InvoiceAmount invoiceAmount;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Part number of the item sold:");
        number = userInput.nextLine();
        System.out.println("Description of the item sold:");
        description = userInput.nextLine();
        System.out.println("Quantity of the items sold:");
        quantity = userInput.nextInt();
        System.out.println("Price per item:");
        price = userInput.nextInt();

        Invoice newInvoice = new Invoice(number, description, quantity, price);
        newInvoice.setItemQuantity(quantity);
        newInvoice.setItemPrice(price);

        System.out.println("-------------INVOICE-------------");
        System.out.println("Items baught:       " + newInvoice.partDescription + " X " + newInvoice.itemQuantity);
        System.out.println("Item ID:            " + newInvoice.partNumber);
        System.out.println("Price per item:     " + newInvoice.itemPrice);
        System.out.println("---------------------------------");
        System.out.println("Total:              " + invoiceAmount.getInvoiceAmount(newInvoice));
        System.out.println("---------------------------------");
    }
}
