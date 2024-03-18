package semana;

import java.util.Scanner;

/**
 * A program to find the largest number among a series of input numbers.
 */
public class Main {
    /**
     * The main method to execute the program.
     * 
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of numbers:");
        int N = 0;
        try {
            N = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid number.");
            return;
        }

        if (N <= 0) {
            System.out.println("The number of numbers must be a positive integer.");
            return;
        }

        long largestNumber = Long.MIN_VALUE; 
        System.out.println("Enter the " + N + " numbers separated by a space:");

        for (int i = 0; i < N; i++) {
            if (scanner.hasNextLong()) {
                long number = scanner.nextLong();

                if (number > largestNumber) {
                    largestNumber = number;
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                return;
            }
        }

        System.out.println("The largest number entered is: " + largestNumber);

        scanner.close();
    }
}
