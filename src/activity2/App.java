package activity2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is defined only for non-negative integers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) throws outOfRangeException {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter a number between 1 and 10 to find its factorial:");
            int num1 = scan.nextInt();
            if (num1 < 1 || num1 > 10) {
                throw new outOfRangeException();
            } else {
                long result = factorial(num1);
                System.out.println("Factorial of " + num1 + " is " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Both values have to be whole numbers");
        } finally {
            scan.close();
        }
    }
}