public class TestPackage {
    public static void main(String[] args) {

        Address customer001 = new Address("John H. Watson",
                "Baskerville Hall",
                "Grimpen",
                "United Kingdom",
                "PL20");
        Address customer002 = new Address("Sherlock Holmes",
                "221B Baker Street",
                "London",
                "United Kingdom",
                "NW1 6XE");
        Package testPackage = new Package(
                customer001,
                customer002,
                7.3,
                0.1
        );
        System.out.println(testPackage.calculateCost());

        TwoDayPackage twoDayPackage = new TwoDayPackage(
                customer001,
                customer002,
                7.3,
                0.1,
                0.7
        );
        System.out.println(twoDayPackage.calculateCost());

        /*TwoDayPackage twoDayPackage = new TwoDayPackage(
                "Alice",
                "St Aldate's",
                "Oxford",
                "United Kingdom",
                "OX11DP",
                "Cheshire Cat",
                "2 Monkend Terrace",
                "Croft-on-Tees",
                "United Kinggdom",
                "DL22SQ",
                15.9,
                0.1,
                1.2
        );*/

        OvernightPackage overnightPackage = new OvernightPackage(
                customer001,
                customer002,
                7.3,
                0.1,
                0.2
        );

        System.out.println(overnightPackage.calculateCost());
        System.out.println(testPackage.recipientAddress.name);
    }
}
