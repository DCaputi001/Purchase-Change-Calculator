import java.util.Scanner; // Importing the Scanner class to get user input

class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in); // Creating a Scanner object to get user input

        // Prompting the user for the total purchase amount
        System.out.print("Enter the total purchase amount (e.g., $2.50 or 2.50): ");
        String userInput = scanner.nextLine(); // Getting user input as a string

        // Remove dollar sign and convert to double
        final double totalPurchaseAmount = Double.parseDouble(userInput.replace("$", "")); // Removing '$' and converting to a double

        // Prompting the user for the amount paid
        System.out.print("Enter the amount paid by the customer (e.g., $3.00 or 3.00): ");
        userInput = scanner.nextLine(); // Getting user input as a string

        // Remove dollar sign and convert to double
        final double amountPaid = Double.parseDouble(userInput.replace("$", "")); // Removing '$' and converting to a double

        // Calculating the change in cents
        int change = (int) ((amountPaid - totalPurchaseAmount) * 100);

        // Checking if the amount paid is insufficient
        if (change < 0) {
            System.out.println("Error: Insufficient amount paid.");
        }
        // Checking if no change is needed
        else if (change == 0) {
            System.out.println("No change.");
        }
        // Calculating denominations of change
        else {
            // Calculating number of dollars
            final int dollar = change / 100;
            if (dollar == 1) {
                System.out.println(dollar + " Dollar");
                change = change - (dollar * 100); // Updating the change amount
            } else if (dollar > 0) {
                System.out.println(dollar + " Dollars");
                change = change - (dollar * 100); // Updating the change amount
            }

            // Calculating number of quarters
            final int quarter = change / 25;
            if (quarter == 1) {
                System.out.println(quarter + " Quarter");
                change = change - (quarter * 25); // Updating the change amount
            } else if (quarter > 0) {
                System.out.println(quarter + " Quarters");
                change = change - (quarter * 25); // Updating the change amount
            }

            // Calculating number of dimes
            final int dime = change / 10;
            if (dime == 1) {
                System.out.println(dime + " Dime");
                change = change - (dime * 10); // Updating the change amount
            } else if (dime > 0) {
                System.out.println(dime + " Dimes");
                change = change - (dime * 10); // Updating the change amount
            }

            // Calculating number of nickels
            final int nickel = change / 5;
            if (nickel == 1) {
                System.out.println(nickel + " Nickel");
                change = change - (nickel * 5); // Updating the change amount
            } else if (nickel > 0) {
                System.out.println(nickel + " Nickels");
                change = change - (nickel * 5); // Updating the change amount
            }

            // Calculating number of pennies
            final int penny = change / 1;
            if (penny == 1) {
                System.out.println(penny + " Penny");
                change = change - penny; // Updating the change amount
            } else if (penny > 0) {
                System.out.println(penny + " Pennies");
                change = change - (penny * 2); // Updating the change amount
            }
        }
    }
}
