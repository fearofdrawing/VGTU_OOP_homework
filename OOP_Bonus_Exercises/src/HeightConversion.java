// Write a program that asks the user to enter a height in centimeters
// and then displays the height in centimeters and in feet and inches.
// Fractional centimeters and inches should be allowed, and the program
// should allow the user to continue entering heights
// until a non-positive value is entered.

import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        double userHeight;
        double heightInches;
        double inches;
        int feet;

        System.out.println("Enter height in centimeters:");
        userHeight = userInput.nextDouble();

        while (userHeight > 0) {

                heightInches = userHeight / 2.54;
                feet = (int)Math.floor(heightInches / 12);
                inches = (double)Math.round((heightInches - 12 * feet) * 10) / 10;
                System.out.println(userHeight + " cm = " + feet + " feet, " + inches + " inches\n");

                System.out.println("Enter height in centimeters:");
                userHeight = userInput.nextDouble();
        }
        System.out.println("Bye!");
    }
}
