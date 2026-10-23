
/**
 * Main
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //our scanner
          Scanner InputScanner  = new Scanner(System.in);
        
          //Variable area po dito
          int userChoiceNum;




          System.out.println(" ");
          System.out.println("================================");
          System.out.println("          BUDGET TRACKER        ");
          System.out.println("================================");
          System.out.println("");

          //Choices for the users
          System.out.println("[1] Set Budget");
          System.out.println("[2] Add Income");
          System.out.println("[3] Add Expense");
          System.out.println("[4] View Transactions");
          System.out.println("[6] Exit");
          System.out.println(" ");


          System.out.print("Please enter your choice (numbers only): ");
          userChoiceNum = InputScanner.nextInt();

          




    }
}