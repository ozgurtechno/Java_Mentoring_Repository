package Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {


        // Write a guess number game....
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break; // Exit the loop when the number is guessed correctly
            }
        }

        scanner.close();
        System.out.println("Thank you for playing!");





    }
}
