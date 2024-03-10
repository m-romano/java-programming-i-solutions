
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] texts = input.split(" ");
            if (input.isEmpty()) {
                break;
            }

            System.out.println(texts[0]);
        }


    }
}
