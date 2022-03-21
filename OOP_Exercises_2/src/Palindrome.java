//Write a program that uses the vector and checks whether the vector contains a palindrome,
// i.e. whether the vector does or does not read the same forward as backward.

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Enter a list of items (type \"stop\" to finnish:");
        ArrayList<String> listOfItems = new ArrayList<String>();
        Scanner itemInput = new Scanner(System.in);
        String item;
        int j = 0;

        while (itemInput.hasNext()) {
            item = itemInput.next();
            if (item.equals("stop"))
                break;

            listOfItems.add(item);
        }
        System.out.println(listOfItems);

        for (int i = 0; i < listOfItems.size() / 2; i++) {

            if (listOfItems.get(i).equals(listOfItems.get(listOfItems.size() - (i + 1)))) {
                j ++;
            }
        }
        if (j > 0) {
            System.out.println("The provided list contains a palindrome");
        }
        else System.out.println("The provided list does not contain a palindrome");
    }
}
