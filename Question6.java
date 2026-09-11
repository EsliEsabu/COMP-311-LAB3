//Esli Quest Esabu

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int total = 0;

        do {
            System.out.println("Enter a number (0 to stop):");
            number = input.nextInt();
            total += number;
        } while (number != 0);

        System.out.println("Final total: " + total);

        input.close();
    }
}