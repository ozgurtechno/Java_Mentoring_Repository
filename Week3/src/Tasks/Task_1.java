package Tasks;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {


        // Ask User to enter PIN number, if true give message "Access Granted"...
        // If user enters false PIN number warn him/her "Your PIN is incorrect, Please try again"...
        // User has 3 attempt to enter his/her PIN number correctly...

        Scanner input = new Scanner(System.in);

        int realPIN = 1234;
        int attempt = 1;

        do {
            System.out.print("Enter your PIN number: ");
            int pin = input.nextInt();
            if (pin == realPIN){
                System.out.println("Access Granted"); break;
            }else if (attempt != 3){
                System.out.println("Your PIN is incorrect, Please try again");
            }else {
                System.out.println("Your Phone Blocked...");
            }
            attempt++;

        }while (attempt <= 3);
    }
}
