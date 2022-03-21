// Read a set of integers into a vector.
// Print the sum of each pair of adjacent elements.
// Change your program so that it prints the sum of the first and last elements,
// followed by the sum of the second and second-to-last, and so on.

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_of_elements {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a set of integers (hit any letter key to finnish):");

        ArrayList<Integer> ints = new ArrayList<Integer>();

        while (userInput.hasNextInt()) {
            ints.add(userInput.nextInt());
        }
        System.out.println(ints);

        for (int i = 0; i < (ints.size() - 1); i++) {
            int sumNext = ints.get(i) + ints.get(i + 1);
            System.out.println(sumNext);
        }
        System.out.println();

        /////////////////////////////////////////////////////////////////////////

        for (int i = 0; i < (ints.size()) / 2; i++) {
            int sum = ints.get(i) + ints.get(ints.size() - (i + 1));
            System.out.println(sum);
        }
        if (ints.size()%2 != 0) {
            System.out.println(ints.get(ints.size() / 2));
        }
    }
}
