import java.util.Scanner;

public class MathMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a begin number: ");
        int begin = scanner.nextInt();
        System.out.print("Enter an end number: ");
        int end = scanner.nextInt();

        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d : %,d%n", begin, end, sum);

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %,d%n", begin, end, product);

        scanner.close();
    }

    public static long getSumBetween(int beginNum, int endNum) {
        long result = 0;

        for (int i = beginNum; i <= endNum; i++)
        {
            result += i;
        }

        return result;
    }

    public static long getProductBetween(int beginNum, int endNum) {
        long result = 1;

        for (int i = beginNum; i <= endNum; i++)
        {
            result *= i;
        }

        return result;
    }
}
