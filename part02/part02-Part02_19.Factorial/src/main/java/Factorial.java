
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int value = Integer.parseInt(scanner.nextLine());

        long factorial = 1;

        for (int i = 1; i <= value; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);

    }
}
