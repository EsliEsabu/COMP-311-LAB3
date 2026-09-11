//Esli Quest Esabu 24019733
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        //get the number from the user
        System.out.println("Enter a number:");
        int number  = input.nextInt();

//print the table from 1 to 12
        for (int i = 1; i <= 12; i++){
            System.out.println(number + "x" + i + "=" + (number * i));
        }
    }
}
