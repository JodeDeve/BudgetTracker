
/**
 * Main
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
          Scanner InputScanner  = new Scanner(System.in); // The Scanner code named "InputScanner"

        // Budget Objects Here
        int Budget = 0;

       
        // Income Object Here
        int Income = 0;
        
          // Variable area po dito
        boolean Choicemenu = true; // 
        int userChoiceNum;


        // Expenses Area Here
        int expenses[] = new int[100]; // These two Arrays are for the expenses 
        String description[] = new String[100];
        int expensesCount = 0;

          System.out.println(" ");
          System.out.println("================================");
          System.out.println("          BUDGET TRACKER        ");
          System.out.println("================================");
          System.out.println("");

          //Choices for the users

        while (Choicemenu) {
          System.out.println("[1] Set Budget");
          System.out.println("[2] Add Income");
          System.out.println("[3] Add Expense");
          System.out.println("[4] View Transactions");
          System.out.println("[6] Exit");
          System.out.println(" ");


          System.out.print("Please enter your choice (numbers only): ");
            
            if (InputScanner.hasNextInt()) { // If statement for checking if the input is an int
          userChoiceNum = InputScanner.nextInt();

                switch (userChoiceNum) {
                    case 1:
                        System.out.print("Pls Enter Your Desired Budget: ");
                        Budget = InputScanner.nextInt();
                        break;
                    case 2: 
                        System.out.print("Pls Enter Your Income: ");
                        Income = InputScanner.nextInt();
                        break;
                    case 3:
                        System.out.print("How Many Expenses Would You Want? The limit is only 100. ");
                        int amount = InputScanner.nextInt(); // Stores the amount of times the the loop will run
                        InputScanner.nextLine();

                        if (amount > 0 && amount <= expenses.length - expensesCount) { // Check if the amount is valid and there is enough space
                            
                            for (int i = 0; i < amount; i++) {  // Repeat the loop based on how many expenses the user wants
                                System.out.print("Enter Expenses Description: "); // Ask for the expense description and save it in the next available slot in the array
                                description[expensesCount] = InputScanner.nextLine();

                                System.out.print("Enter The Amount of Expenses: "); // Ask for the expense amount and save it in the same slot in the array
                                expenses[expensesCount] = InputScanner.nextInt();
                                InputScanner.nextLine();
                                expensesCount++;  // Increase the count so the next expense uses the next slot
                            }
                        } else {
                            System.out.println("Invalid Amount or not enough Space. Pls Try again ");
                        }
                        break;
                    case 4:
                        break; // Placeholders. Input nalang kayo code wala pa ako na isip na structure
                    case 5;
                        break;
                    case 6:
                        break;
                    default:
                        break;

            }
        } else {
                System.out.println("Invalid Input. Pls Try Again");
                InputScanner.next();
                System.out.println("");
            }

        }

          


    
    }
    }
