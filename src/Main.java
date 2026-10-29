
/**
 * Main
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner InputScanner = new Scanner(System.in)) { // The Scanner code named "InputScanner"

        // Login Account System Objects Here
        String SavedUsername; // Wala pa ako na isip kung pano ko i-save yung username and password, pero sa ngayon, eto muna
        String SavedPassword; 
        String Username; // Variable for the entered username
        String Password; // Variable for the entered password
        boolean login = true; // Variable for the login system

        // Variable area po dito
        boolean Choicemenu = true;
        boolean SetTrigger = false;

        int userChoiceNum;
        int incomeTracker = 0;
        int incomeTotal;

        // Budget Objects Here
        int Budget = 0;

        // Income Object Here
        int Income = 0;
        int incomeList[] = new int[10000000];

        // Expenses Area Here
        int expenses[] = new int[100]; // These two Arrays are for the expenses 
        String description[] = new String[100];
        int expensesCount = 0;

        System.out.println("Welcome To Budget Tracker"); // Pagandahin mo nga eto juddy na welcome screen na bored ako mag design
        System.out.println("Created By: Gile, Jode, Vargas, Adrian, Joerge");
        System.out.println("");
        System.out.println("Create An Account To Get Started.");
        System.out.println("");

        while (login) { // While loop for the login system
        System.out.print("Enter Your Username: ");
        Username = InputScanner.nextLine();

        if (Username.equals("johhny sins") || // If staement for checking if the username values matches any of the invalid usernames
            Username.equals("pisot") || // Or operator for checking multiple values
            Username.equals("cum") ||
            Username.equals("porn") ||
            Username.equals("sex") ||
            Username.equals("fuck") ||
            Username.equals("dick") ||
            Username.equals("cock") ||
            Username.equals("pussy") ||
            Username.equals("ass") ||
            Username.equals("bitch") ||
            Username.equals("nigger") ||
            Username.equals("shit") ||
            Username.equals("sarap ni jode")) {
            System.out.println();
            System.out.println("Invalid username. Please try again.");
            System.out.println();
            continue; // For returning to the start of the loop

        } else if (Username.equalsIgnoreCase("pogi ni sir dhan") ||
            (Username.equalsIgnoreCase("sir dhan pogi")) ||
            (Username.equalsIgnoreCase("sarap ni sir dhan"))) {
                System.out.println("");
                System.out.println("Pogi Talaga ni Sir noh?");
                System.out.println("");
            }

        System.out.print("Create Your Password: ");
        Password = InputScanner.nextLine();

        System.out.println("Welcome " + Username + " You have successfully created an account! ");
        System.out.println("");
        login = false;

    }
        System.out.println(" ");
        System.out.println("================================");
        System.out.println("          BUDGET TRACKER        ");
        System.out.println("================================");
        System.out.println("");

        System.out.println("[1] Set Budget");
        System.out.println("[2] Add Income");
        System.out.println("[3] Add Expense");
        System.out.println("[4] View Transactions");
        System.out.println("[5] Exit");
        System.out.println(" ");
        //Choices for the users

        System.out.print("Please enter your choice (numbers only): ");
        while (Choicemenu) {
            if (InputScanner.hasNextInt()) { // If statement for checking if the input is an int
                userChoiceNum = InputScanner.nextInt();

                switch (userChoiceNum) {
                    case 1:
                        //this if-else checks whether the user have already chose 1, we can only allow users to select 1 one time
                        if (SetTrigger) {
                            System.out.println("You have already set your budget! Can't alter it, please select another number");
                        } else {
                            SetTrigger = true;

                            System.out.print("Pls Enter Your Desired Budget: ");
                            Budget = InputScanner.nextInt();
                            System.out.println("you're budget is " + Budget + " ");
                            System.out.println(" ");

                            System.out.println("what do you wan't do do next");
                        }

                        break;
                    case 2:
                        System.out.println("okay you want to enter your income");
                        System.out.print("Pls Enter Your Income: ");
                        Income = InputScanner.nextInt();
                        incomeTotal = Income + incomeTracker;

                        System.out.println("You're income is " + incomeTotal);
                        System.out.println(" ");

                        System.out.println("what do you wan't do do next");

                        break;
                    case 3:
                        while (true) {
                        System.out.print("How Many Expenses Would You Want? The limit is only 100: ");
                        int amount = InputScanner.nextInt(); // Stores the amount of times the the loop will run
                        InputScanner.nextLine();

                        if (amount > 0 && amount <= expenses.length - expensesCount) { // Check if the amount is valid and there is enough space

                            for (int i = 0; i < amount; i++) {  // Repeat the loop based on how many expenses the user wants
                                System.out.print("Enter Expenses Description: "); // Ask for the expense description and save it in the next available slot in the array
                                System.out.print("");
                                description[expensesCount] = InputScanner.nextLine();
                        

                                System.out.print("Enter The Amount of Expenses: "); // Ask for the expense amount and save it in the same slot in the array
                                System.out.print("");
                                expenses[expensesCount] = InputScanner.nextInt();
                                InputScanner.nextLine();
                                expensesCount++;  // Increase the count so the next expense uses the next slot
                                break;
                            }
                        } else {
                            System.out.println("Invalid Amount or not enough Space. Pls Try again ");
                        }
                        }
                    case 4:
                        System.out.println("You're current Budget is " + Budget);
                        for (int lists : incomeList) {
                            System.out.println("you're current income added are " + lists + " ");
                        }
                        break; // Placeholders. Input nalang kayo code wala pa ako na isip na structure
                    case 5:
                        break;
                    default:
                        System.out.println("");
                        System.out.println("Invalid Input. Pls Try Again");
                }

            } else {
                System.out.println("Invalid Input. Pls Try Again");
                InputScanner.next();
                System.out.println("");
            }

        }

    }
}
}