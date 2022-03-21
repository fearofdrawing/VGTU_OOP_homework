public class OvernightPackage extends Package {
    double overnightFee;

    public OvernightPackage() {

    }

    public OvernightPackage(
            Address senderAddress,
            Address recipientAddress,
            double weight,
            double costPerOunce,
            double overnightFee) {
        super(
                senderAddress,
                recipientAddress,
                weight,
                costPerOunce);
        this.overnightFee = overnightFee;
    }

    public double getOvernightFee() {
        return overnightFee;
    }

    public void setOvernightFee(double overnightFee) {
        this.overnightFee = overnightFee;
    }

    @Override
    public double calculateCost() {
        return (double)Math.round((weight * (costPerOunce + overnightFee)) * 100) / 100;
    }
}
