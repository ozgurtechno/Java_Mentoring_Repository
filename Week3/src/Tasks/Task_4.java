package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        int[] primes = new int[end-start];

        int count = 0;
        for (int number = start; number <= end; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes[count++] = number;
        }

        Arrays.stream(primes).filter(i -> i != 0).forEach(i -> System.out.print(i + " "));


    }
}

