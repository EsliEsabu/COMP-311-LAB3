import java.util.Scanner;

public class Question9 {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = input.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }
}
