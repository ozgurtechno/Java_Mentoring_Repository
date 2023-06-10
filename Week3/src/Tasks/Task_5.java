package Tasks;

import java.util.Scanner;

public class Task_5 {
    public static void printFloydsTriangle(int rows) {
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
//
//         1
//         2 3
//         4 5 6
//         7 8 9 10


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int rows = scanner.nextInt();

        printFloydsTriangle(rows);
    }
}

