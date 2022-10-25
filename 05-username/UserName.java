
/**
 * Write a description of class UserName here.
 *
 * @Emmanuel
 * @10-12-
 */
import java.util.Scanner;

public class UserName {
public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    
    System.out.println("Hello " + getInitial(firstName) + "." + getInitial(lastName) + ".");
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a length for your password: ");
    int length = input.nextInt();
    generatePassword(length);
    s.close();
  } // end main method
/*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String getInitial(String n) {
    return n.substring(0, 1);
  } // end initialize method
  //password generation
  //input password length (int)
  //return the password (string)
  public static String generatePassword(int length) {
    String password = "";
    for(int i = 0; i <length; i++) {
        int choice = (int)(Math.random()* 3 + 1);
        if (choice == 1) {
        int rand3 = (int)(Math.random()*(47-33+1)+33);
        char b = (char)rand3;
        password += b;
        }
        else if (choice == 2) {
        int rand = (int)(Math.random()*(90-65+1)+65);
        char c = (char)rand;
        password += c;
    }
        else if (choice == 3) {
            int rand2 = (int)(Math.random()*(122-97+1)+97);
        char d = (char)rand2;
        password += d;
    }
}
    System.out.print("Your password is: " + password);
    return(password);
}//end password method
} // end class
