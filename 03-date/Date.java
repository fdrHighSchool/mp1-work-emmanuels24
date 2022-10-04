
/**
 * Write a description of class Main here.
 *
 * @Emmanuel
 * @9/28/22
 */
import java.util.Scanner;

class Date
{
    public static void main (String[]args){
        Scanner myObj = new Scanner (System.in);//create scanner
        System.out.println("Enter the day of the week");
        
        String day = myObj.nextLine();
        System.out.println("Enter the month");
        
        String month = myObj.nextLine();
        System.out.println("Enter the year");
        
        int year = myObj.nextInt();
        System.out.println("Enter the day of the month");
        
        int daynumb = myObj.nextInt();
        System.out.println("Enter date format, EU or US");
        
        String form = myObj.nextLine();
        System.out.println(" " + day + " , " daynumb; " " + month " , " + year" ");
        System.out.println(" " + day + month + daynumb " " + year);
        }
    }//end of class Main
