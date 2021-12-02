import java.util.Scanner;
import java.lang.Math;

enum Command { ArrayEnum, ADD, LIST, AVG, SUM, STD, QUIT, INVALID }

public class ArrayEnum {
    public static void main(String[] args) {
        int[] values = new int[100];
        int index = 0;

        final Scanner scanner = new Scanner(System.in);

        while (true) {
            final Command command = getCommand(scanner);
            if (command == Command.QUIT) {
                System.out.println("Bye!");
                break;
            }
            switch ( command ) {
                case ADD:
                    final int newValue = getValue(scanner);
                    if (index < 100) {
                        values[index] = newValue;
                        index++;
                    }
                    break;
                case LIST:
                    printList(values, index);
                    break;
                case AVG:
                    System.out.printf("%.2f%n", getAvg(values, index));
                    break;
                case SUM:
                    System.out.println(getSum(values, index));
                    break;
                case STD:
                    System.out.printf("%.2f%n", getStd(values, index));
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
            }
        }
        scanner.close();
    }

    public static Command getCommand(Scanner scnr) {
        Command myCmd;
        try {
            myCmd = Command.valueOf(scnr.next().toUpperCase());
        } catch (IllegalArgumentException e) {
            myCmd = Command.INVALID;
        }
        return myCmd;
    }

    public static int getValue(Scanner scnr) {
        return scnr.nextInt();
    }

    public static void printList(int[] arr, int idx) {
        int i;
        for (i = 0; i < idx - 1; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println(arr[i]);
    }

    public static double getAvg(int[] arr, int idx) {
        return (double)getSum(arr, idx) / idx;
    }

    public static int getSum(int[] arr, int idx) {
        int sum = 0;
        for (int i = 0; i < idx; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static double getStd(int[] arr, int idx) {
        double avg = getAvg(arr, idx);
        double dispersion = 0.0;
        for (int i = 0; i < idx; i++) {
            dispersion += Math.pow(avg - arr[i], 2.0);
        }
        dispersion /= idx;

        return Math.sqrt(dispersion);
    }
}
