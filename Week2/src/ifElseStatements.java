import java.util.Scanner;

public class ifElseStatements {

    public static void main(String[] args) {

        int  score;    // To hold a test score
        char grade;    // To hold a letter grade

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get the test score.
        System.out.print("Enter your numeric test score : ");
        score = console.nextInt();

        // Calculate the grade.
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the grade.
        System.out.println("Your grade is " + grade);
    }
}
