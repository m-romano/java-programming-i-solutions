
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstValue = Integer.parseInt(scanner.nextLine());
        int secondValue = Integer.parseInt(scanner.nextLine());
        int sum = (firstValue + secondValue);
        double squareRoot = Math.sqrt(sum);

        System.out.println(squareRoot);

    }
}
