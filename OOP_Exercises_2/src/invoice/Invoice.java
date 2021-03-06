// Create a class called Invoice that a hardware store might use to represent an invoice
// for an item sold at the store. An Invoice should include four data members—
// a part number (type string), a part description (type string),
// a quantity of the item being purchased (type int) and a price per item (type int).
// Your class should have a constructor that initializes the four data members.
// Provide a set and a get function for each data member. In addition, provide a member function
// named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity
// by the price per item), then returns the amount as an int value. If the quantity is not positive,
// it should be set to 0. If the price per item is not positive, it should be set to 0.
// Write a test program that demonstrates class Invoice’s capabilities.

package invoice;

public class Invoice {
    String partNumber;
    String partDescription;
    int itemQuantity;
    int itemPrice;

    public Invoice(String partNumber, String partDescription, int itemQuantity, int itemPrice) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        if (itemQuantity < 0) {
            itemQuantity = 0;
        }
        this.itemQuantity = itemQuantity;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        if (itemPrice < 0) {
            itemPrice = 0;
        }
        this.itemPrice = itemPrice;
    }
}
