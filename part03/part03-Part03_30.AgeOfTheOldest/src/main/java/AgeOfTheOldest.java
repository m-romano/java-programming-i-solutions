
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] peoples = input.split(",");
            if (Integer.parseInt(peoples[1]) > oldest) {
                oldest = Integer.parseInt(peoples[1]);
            }
        }
        System.out.println(oldest);
    }
}
