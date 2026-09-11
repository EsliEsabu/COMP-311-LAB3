// Esli Quest Esabu 24019733
import java.util.Scanner;
public class Question4{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int choice;

        do {//displaying menu
            System.out.println("1.Continue");
            System.out.println("2.Exit");
            System.out.println("Enter choice:");
            choice = input.nextInt();
        }
        //repat until user choose 2
        while (choice !=2);
        System.out.println("Goodbye!");

    }
}