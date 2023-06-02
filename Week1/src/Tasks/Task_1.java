package Tasks;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Get the amount from the user as double
                System.out.print("Enter the amount in cents: "); // 123 cents
                double amount = scanner.nextDouble();
                // 110.4
                // Convert double to integer
                int netAmount = (int) amount;

                // Calculate the change
//                int quarters = netAmount / 25;
//                int dimes = (netAmount % 25) / 10 ;             // 23 / 10 = 2 dimes...
//                int nickels = (( netAmount % 25 ) % 10) / 5;                                 // 123 --> 23 --> 3      3 / 5 = 0
//                int pennies = (( netAmount % 25 ) % 10) % 5;

                int quarters = netAmount / 25;
                int dimes = (netAmount % 25) / 10;
                int nickels = (netAmount % 25 % 10) / 5;
                int pennies = (netAmount % 25 % 10) % 5;

                // 256 % 25 --> 6 remainder from division      256 / 25 = 10 this is the result


                // Display the change
                System.out.println("Quarters: " + quarters);  // 25 cents
                System.out.println("Dimes: " + dimes);        // 10 cents
                System.out.println("Nickels: " + nickels);    // 5 cents
                System.out.println("Pennies: " + pennies);    // 1 cent

                // Example : 123 cents is 4 quarters, 2 dimes, 0 nickels, 3 pennies


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
