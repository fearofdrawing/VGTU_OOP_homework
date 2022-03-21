public class Package {
    Address senderAddress;
    Address recipientAddress;

    double weight;
    double costPerOunce;

    public Package() {
    }

    public Package(
            Address senderAddress,
            Address recipientAddress,
            double weight,
            double costPerOunce) {
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
        this.weight = weight;
        this.costPerOunce = costPerOunce;
    }

    public Address getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(Address senderAddress) {
        this.senderAddress = senderAddress;
    }

    public Address getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(Address recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
        else {
            System.out.println("Weight can't be less than zero.");
            System.out.println("Please provide valid package weight!");
        }
    }

    public double getCostPerOunce() {
        return costPerOunce;
    }

    public void setCostPerOunce(double costPerOunce) {
        if (costPerOunce > 0) {
            this.costPerOunce = costPerOunce;
        }
        else {
            System.out.println("Cost per ounce can't be less than zero.");
            System.out.println("Please provide valid cost!");
        }
    }

    public double calculateCost() {
        return (double)Math.round((weight * costPerOunce) * 100) / 100;
    }
}
