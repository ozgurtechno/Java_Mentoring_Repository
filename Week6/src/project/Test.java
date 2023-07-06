package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount("alex", "2222", 2000);
        BankAccount ba2 = new BankAccount("john", "3333", 3000);
        BankAccount ba3 = new BankAccount("mary", "4444", 5000);
        BankAccount ba4 = new BankAccount("fred", "5555", 4000);
        BankAccount ba5 = new BankAccount("mark", "6666", 1000);
        ArrayList<BankAccount> list = new ArrayList<BankAccount>(List.of(ba1, ba2, ba3, ba4, ba5));

        Scanner in = new Scanner(System.in);

        System.out.print("enter username: ");
        String username = in.next();
        System.out.print("enter pincode: ");
        String pincode = in.next();

        int indexOfActiveUser = -1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getUsername().equals(username) && list.get(i).getPinCode().equals(pincode)){
                indexOfActiveUser = i; //if we find a user we just save its index in the arraylist
                break;
            }
        }

        if(indexOfActiveUser != -1){ //if we found user with entered username and pincode
            while(true){
                System.out.println("press 1 to check your money balance");
                System.out.println("press 2 to deposit money");
                System.out.println("press 3 to withdraw money");
                System.out.println("press 4 to change your pincode");
                System.out.println("press 5 to exit the user menu");

                int num = in.nextInt();

                if(num == 1){
                    System.out.println("your money balance is: " + list.get(indexOfActiveUser).getMoneyBalance() + "$");
                }
                else
                if(num == 2){
                    System.out.print("enter amount of money to deposit in $");
                    double money = in.nextInt();
                    list.get(indexOfActiveUser).deposit(money);
                }
                else
                if(num == 3){
                    System.out.print("enter amount of money to withdraw in $");
                    double money = in.nextInt();
                    list.get(indexOfActiveUser).withdraw(money);
                }
                else
                if(num == 4){
                    System.out.print("enter old pincode: ");
                    String oldPinCode = in.next();
                    System.out.print("enter new pincode: ");
                    String newPinCode = in.next();

                    list.get(indexOfActiveUser).changePinCode(oldPinCode, newPinCode);
                }
                else
                if(num == 5){
                    System.out.println("bye bye, " + list.get(indexOfActiveUser).getUsername());
                    break;
                }
            }
        }
        else{
            System.out.println("the username or pincode is not correct, so try later!");
        }
    }
}
