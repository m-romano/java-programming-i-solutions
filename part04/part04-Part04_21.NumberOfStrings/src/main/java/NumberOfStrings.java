
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            counter += 1;
        }

        System.out.println(counter);

    }
}
