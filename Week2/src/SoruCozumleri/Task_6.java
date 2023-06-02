package SoruCozumleri;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Area Calculator!");

        System.out.println("Select a shape to calculate its area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");

        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        double area = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();

                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();

                area = length * width;
                break;
            case 2:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();

                area = Math.PI * Math.pow(radius, 2);
                break;
            case 3:
                System.out.print("Enter the base length of the triangle: ");
                double base = scanner.nextDouble();

                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();

                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid choice. Please select a valid shape.");
                break;
        }

        System.out.println("The area is: " + area);

        scanner.close();
        System.out.println("Thank you for using the Area Calculator!");
    }

}

