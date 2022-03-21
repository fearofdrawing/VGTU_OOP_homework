// Read a sequence of words from cin and store the values a vector.
// After you’ve read all the words, process the vector and change each word to uppercase.
// Print the transformed elements, eight words to a line.

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class WordList {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a sequence of words (type \"stop\" to finnish):");

        String word;
        int counter;

        ArrayList<String> wordList = new ArrayList<String>();

        while (userInput.hasNext()) {
            word = userInput.next();
            if (word.equals("stop"))
                break;
            wordList.add(word);
        }
        System.out.println(wordList);

        for (int i = 0; i < wordList.size(); i++) {
            String listItem = wordList.get(i).toUpperCase(Locale.ROOT);
            wordList.set(i, listItem);
        }

        counter = 0;
        for (int i = 0; i < wordList.size(); i++) {
            System.out.print(wordList.get(i) + " ");
            counter ++;
            if (counter%8 == 0) {
                System.out.print("\n");
            }
        }
    }
}
