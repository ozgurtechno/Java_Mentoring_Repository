package Tasks;

import java.util.Scanner;

public class Task_3 {

    // Given an email address, check if it is valid email

    /*

    1- Should end with Email ".com"
    2- Email "@" symbol must be
    3- "@" should be before ".com"
    4- Before "@", there should be an letter
    5- Between "@" and ".com", there should be a letter

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter your email address : ");
        String email = input.next();

        if (
                email.contains("@")
                        &&
                        email.contains(".com")
                        &&
                        email.indexOf("@") < email.indexOf(".com")
                        &&
                        !email.substring(0,email.indexOf("@")).isEmpty()
                        &&
                        !email.substring(email.indexOf("@") + 1,email.length() - 4).isEmpty()
        ) {

            System.out.println("Email is valid...");

        }else {
            System.out.println("Email is invalid...");
        }


    }

}
