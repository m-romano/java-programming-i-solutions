
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int value = Integer.parseInt(scanner.nextLine());

        int result = 0;

        for (int i = 0; i <= value; i++) {
            result += i;
        }

        System.out.println("The sum is " + result);

    }
}
