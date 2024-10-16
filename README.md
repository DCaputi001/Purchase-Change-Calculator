# Purchase-Change-Calculator
Change Calculator Application

Description

This Java application calculates the change due from a customer's payment in various denominations (dollars, quarters, dimes, nickels, and pennies). The user inputs the total purchase amount and the amount paid, and the program calculates and displays the correct change to be returned to the customer.

The program uses simple logic to break down the total change into the largest denominations first, and then continues down to the smallest denomination (pennies). It also handles cases where the amount paid is insufficient or exactly matches the total purchase amount.

Features
- Input the total purchase amount and amount paid.
- Calculate the correct change in dollars, quarters, dimes, nickels, and pennies.
- Handles edge cases where no change or insufficient payment is provided.
- User-friendly console interface for easy input and output.

How it Works
- The user is prompted to enter the total purchase amount (e.g., "$2.50" or "2.50").
- The user is prompted to enter the amount paid by the customer (e.g., "$3.00" or "3.00").
- The application calculates the change and breaks it down into dollars, quarters, dimes, nickels, and pennies.
- The result is displayed in the console, showing the amount of each denomination to be returned.
- If the amount paid is insufficient, the application will notify the user.

Requirements
- Java 8 or higher
- No enternal libraries are required

Future Enhancements
- Add support for additional currencies and denominations.
- Implement a GUI for ease of use
- Enhance input validation and error handling

License
This project is licensed under the MIT License - see the LICENSE file for details.

