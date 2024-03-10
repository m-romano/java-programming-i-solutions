
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        String longestName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] details = input.split(",");
            String name = details[0];
            sum += Integer.parseInt(details[1]);
            count++;

            if (name.length() > longestName.length()) {
                longestName = name;
            }


        }
        if (count > 0) {
            System.out.println("Longest name: " + longestName);
            System.out.println("Age of the birth years: " + (1.0 * sum / count));
        } else {
            System.out.println("No input");
        }

    }
}
