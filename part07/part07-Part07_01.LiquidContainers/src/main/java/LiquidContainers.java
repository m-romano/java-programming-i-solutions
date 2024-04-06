
import java.util.Arrays;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (amount < 0) {
                continue;
            }

            switch (command) {
                case "add":
                    first += amount;
                    if (first > 100) {
                        first = 100;
                    }
                    break;
                case "move":
                    if (amount > first) {
                        amount = first;
                    }
                    first -= amount;
                    second += amount;
                    if (second > 100) {
                        second = 100;
                    }
                    break;
                case "remove":
                    second -= amount;
                    if (second < 0) {
                        second = 0;
                    }
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }

        }
    }

}
