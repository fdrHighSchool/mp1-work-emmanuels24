
/**
 * Write a description of class lanternfly here.
 *
 * @Emmanuel (your name)
 * @9/30/22 (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Guess a number between 1-30. ");
        int num = input.nextInt();
        
        Random rand = new Random();

        int number = rand.nextInt(30) + 1;

        if (num == number) {
            System.out.println("Correct number!");
        } // end if statement
        else {
            System.out.println("Wrong number, the correct answer was " + number + " .");
        } // end else statement
        
    } // end main method

} // end class
