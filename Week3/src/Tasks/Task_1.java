package Tasks;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {


        // Ask User to enter PIN number, if true give message "Access Granted"...
        // If user enters false PIN number warn him/her 3 times
        // User has 3 attempt to enter his/her PIN number correctly...

        Scanner input = new Scanner(System.in);

        int realPIN = 123;
        int attempt = 1;

        do {
            System.out.print("Enter your PIN number: ");
            int pin = input.nextInt();
            if (pin == realPIN){
                System.out.println("Access Granted"); break;
            }else if (pin != realPIN && attempt !=3){
                System.out.println("Your PIN is incorrect, Please try again");
            }else {
                System.out.println("Your Card Blocked...");
            }
            attempt++;

        }while (attempt <= 3);
    }
}
