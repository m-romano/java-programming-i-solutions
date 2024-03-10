
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        double average = 0;

        while (true) {
            System.out.println("Give a number:");
            int value = Integer.parseInt(scanner.nextLine());

            if (value == 0) {
                break;
            } else {
                counter = counter + 1;
                sum = sum + value;
                average = (double) sum / counter;
            }
        }
        System.out.println("Average of the numbers: " + average);
    }
}
