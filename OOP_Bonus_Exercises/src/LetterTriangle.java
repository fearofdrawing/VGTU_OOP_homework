// Have a program request the user to enter an uppercase letter.
// Use nested loops to produce a pyramid pattern.
// The pattern should extend to the character entered. For example, the preceding pattern
// would result from an input value of E.
// Hint: Use an outer loop to handle the rows. Use three inner loops in a row,
// one to handle the spaces, one for printing letters in ascending order,
// and one for printing letters in descending order.

import java.util.Scanner;

public class LetterTriangle {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a letter (A-Z):");
        char c = userInput.next().toUpperCase().charAt(0);
        int n = c - 64;

        int o;      // additional variables for increasing and decreasing character sequences' generation

        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = i; j < n; j++) {
                System.out.print(' ');
            }

            o = 0;

            // print increasing character sequence
            for (int p = 1; p <= i; p++) {
                o++;
                System.out.print((char)(o + 64));
            }
            for (int q = 1; q < i; q++) {
                o--;
                System.out.print((char)(o + 64));
            }
            System.out.println();
        }
    }
}
