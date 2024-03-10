
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int firstNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Last number?");
        int lastNumber = Integer.parseInt(scanner.nextLine());

        int result = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            result += i;
        }

        System.out.println("The sum is " + result);

    }
}
