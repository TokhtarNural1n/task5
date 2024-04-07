/**
 * Calculates the nth Fibonacci number.
 * @param n The position of the Fibonacci number to calculate.
 * @return The nth Fibonacci number.
 * If n is 0, return 0 and If n is 1, return 1
 * Recursive step where the Fibonacci sequence is calculated by summing the (n-1)th and (n-2)th Fibonacci numbers
 * Print the n-th Fibonacci number
 */
import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fibonacciNumber = fibonacci(n);
        System.out.println(fibonacciNumber);

        scanner.close();
    }
}
