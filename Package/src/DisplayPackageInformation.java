import java.util.ArrayList;

public class DisplayPackageInformation {

    final static double standardFee = 0.1;
    final static double twoDayFee = 0.7;
    final static double overnightFee = 0.2;

    public static void printSenderData(Package anyPackage) {
        System.out.println(anyPackage.getSenderAddress().getName());
        System.out.println(anyPackage.getSenderAddress().getAddress());
        System.out.println(anyPackage.getSenderAddress().getCity());
        System.out.println(anyPackage.getSenderAddress().getState());
        System.out.println(anyPackage.getSenderAddress().getZip());
    }

    public static void printRecipientData(Package anyPackage) {
        System.out.println(anyPackage.getRecipientAddress().getName());
        System.out.println(anyPackage.getRecipientAddress().getAddress());
        System.out.println(anyPackage.getRecipientAddress().getCity());
        System.out.println(anyPackage.getRecipientAddress().getState());
        System.out.println(anyPackage.getRecipientAddress().getZip());
    }

    public static void printDeliveryCost(Package anyPackage) {
        System.out.println(anyPackage.calculateCost());
    }

    public static void main(String[] args) {

        Address customer001 = new Address(
                "John H. Watson",
                "Baskerville Hall",
                "Grimpen",
                "United Kingdom",
                "PL206TN");
        Address customer002 = new Address(
                "Sherlock Holmes",
                "221B Baker Street",
                "London",
                "United Kingdom",
                "NW1 6XE");
        Address customer003 = new Address(
                "Alice",
                "St Aldate's",
                "Oxford",
                "United Kingdom",
                "OX11DP");
        Address customer004 = new Address(
                "Cheshire Cat",
                "2 Monkend Terrace",
                "Croft-on-Tees",
                "United Kinggdom",
                "DL22SQ");

        Package standardPackage = new Package(customer001, customer002, 7.3, standardFee);
        TwoDayPackage twoDayPackage = new TwoDayPackage(customer003, customer004, 4, standardFee, twoDayFee);
        OvernightPackage overnightPackage = new OvernightPackage(customer004, customer001, 12, standardFee, overnightFee);

        ArrayList<Package> packageList = new ArrayList<>();

        packageList.add(standardPackage);
        packageList.add(twoDayPackage);
        packageList.add(overnightPackage);

        for (int i = 0; i < packageList.size(); i++) {
            System.out.println("SENDER:");
            printSenderData(packageList.get(i));
            System.out.println();
            System.out.println("RECEIVER:");
            printRecipientData(packageList.get(i));
            System.out.println();
            System.out.println("DELIVERY COST:");
            printDeliveryCost(packageList.get(i));
            System.out.println("______________________________\n");
        }

    }

}
