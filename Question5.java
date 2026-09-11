//Esli Quest Esabu 24019733 
import java.util.Scanner;
public class Question5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int number;

        do { 
            //ask untill a  valid number is added
            System.out.println("Enter a number between 1 and 10:");
            number = input.nextInt();

        } while (number < 1 || number > 10);
        System.out.println("Valid number:" +number);   }
    
}
