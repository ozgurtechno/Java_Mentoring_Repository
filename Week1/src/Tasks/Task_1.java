package Tasks;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Get the amount from the user as double
                System.out.print("Enter the amount in cents: ");
                double amount = scanner.nextDouble();

                // Convert double to integer
                int netAmount = 1;

                // Calculate the change
                int quarters = 1;
                int dimes = 1;
                int nickels = 1;
                int pennies = 1;

                // Display the change
                System.out.println("Quarters: " + quarters);
                System.out.println("Dimes: " + dimes);
                System.out.println("Nickels: " + nickels);
                System.out.println("Pennies: " + pennies);


    }
}


























//    // Calculate the change
//    int quarters = amount / 25;
//    int dimes = (amount % 25) / 10;
//    int nickels = ((amount % 25) % 10) / 5;
//    int pennies = ((amount % 25) % 10) % 5;
//
//    // Display the change
//    System.out.println("Quarters: " + quarters);
//    System.out.println("Dimes: " + dimes);
//    System.out.println("Nickels: " + nickels);
//    System.out.println("Pennies: " + pennies);
