// Write a program that uses a while to sum the even numbers from 50 to 100.

public class Sum_even_50_to_100 {
    public static void main(String[] args) {

        int sum = 0;
        int startingNumber = 3;
        int lastNumber = 100;

        while (startingNumber <= lastNumber) {
            if (startingNumber%2 == 0 && startingNumber >= 50) {
                sum = sum + startingNumber;
                startingNumber = startingNumber + 2;
            }
            else startingNumber++;
        }
        System.out.println(sum);
    }
}
