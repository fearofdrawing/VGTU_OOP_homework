public class TwoDayPackage extends Package {
    double flatFee;

    public double getFlatFee() {
        return flatFee;
    }

    public void setFlatFee(double flatFee) {
        this.flatFee = flatFee;
    }

    public TwoDayPackage() {

    }

    public TwoDayPackage(
            Address senderAddress,
            Address recipientAddress,
            double weight,
            double costPerOunce,
            double flatFee) {
        super(
                senderAddress,
                recipientAddress,
                weight,
                costPerOunce);
        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost() {
        return (double)Math.round(((weight * costPerOunce) + flatFee) * 100) / 100;
    }
}
