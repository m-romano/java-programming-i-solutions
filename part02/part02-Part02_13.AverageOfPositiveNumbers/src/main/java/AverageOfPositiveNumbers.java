
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0; int sum = 0; double average = 0; boolean allNegatives = true;

        while (true) {
            int value = Integer.parseInt(scanner.nextLine());

            if (value == 0) {
                break;
            }

            if (value > 0) {
                allNegatives = false;
                counter = counter + 1;
                sum = sum + value;
                average = (double) sum / counter;
            }
        }
        if (allNegatives) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }
    }
}
