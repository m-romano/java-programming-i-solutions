
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();
            String[] peopels = input.split(",");

            if (input.isEmpty()) {
                break;
            }

            if (Integer.parseInt(peopels[1]) > oldest) {
                oldest = Integer.parseInt(peopels[1]);
                name = peopels[0];
            }
        }
        System.out.println(name);
    }
}
