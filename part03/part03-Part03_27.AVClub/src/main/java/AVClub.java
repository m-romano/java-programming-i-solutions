
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String[] texts = input.split(" ");
                for (int i = 0; i < texts.length; i++) {
                    if (texts[i].contains("av")) {
                        System.out.println(texts[i]);
                }
            }
            if (input.isEmpty()) {
                break;
            }
        }
    }
}
