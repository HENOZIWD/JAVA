import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int inputNum = scanner.nextInt();

        for (int i = 1; i <= inputNum; i++) {
            System.out.println("Factorial of " + i + " = " + getFactorial(i));
        }
    }

    private static long getFactorial(final int n) {
        long result = n;
        for (int i = n - 1; i > 1; i--) {
            result *= i;
        }

        return result;
    }
}
