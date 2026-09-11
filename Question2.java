//Esli Quest Esabu 24019733

import java.util.Scanner;
public class Question2{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        // Get a number from the user
        System.out.println("Enter a postitive number:");
        int number = input.nextInt();

        int sum = 0;
        int i = 1;

        // add numbers from 1 to the users number
        while (i <= number){
            sum += i;
            i++;
        }
        System.out.println("Sum:" + sum);
    }
}

