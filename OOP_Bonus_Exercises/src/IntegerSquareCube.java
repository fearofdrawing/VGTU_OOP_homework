// Write a program that prints a table with each line giving an integer, its square, and its cube.
// Ask the user to input the lower and upper limits for the table. Use a for loop.

import java.util.Scanner;

public class IntegerSquareCube {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an integer (the lower boundary):");
        int lower = userInput.nextInt();
        System.out.println("Enter an integer (the upper boundary):");
        int upper = userInput.nextInt();

        System.out.println("------------------------");
        System.out.format("%-10s%-10s%-10s%n", "Integer", "Square", "Cube");
        System.out.println("------------------------");

        for (int i = lower; i <= upper; i++) {
            int square = i * i;
            int cube = i * i * i;

            System.out.format("%-10d%-10d%-10d%n", i, square, cube);
        }
        System.out.println("------------------------");
    }
}
