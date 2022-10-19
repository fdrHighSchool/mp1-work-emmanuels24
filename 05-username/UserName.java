
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

    System.out.print("Enter your favorite number: ");
    String favNum = s.nextLine();
    
    System.out.print("Are you a teacher or a student? ");
    String posit = s.nextLine();
    
    // test output
    if (posit.equalsIgnoreCase("Student")) {
        System.out.println("Your email is: " + getInitial(firstName) + "" + getInitial(lastName) + "" + (favNum) + "@nycstudents.net");
    }
    else if (posit.equalsIgnoreCase("Teacher")) {
        System.out.println("Your email is: " + getInitial(firstName) + "" + getInitial(lastName) + "" + (favNum) + "@schools.nyc.gov");
        
    }
    generatePassword(8);
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
      int rand = (int)(Math.random()*(90-65+1)+65);
      char c = (char)rand;
      System.out.println(rand + " " + c);
      return password;
    }//end password method
} // end class
