import java.util.Scanner;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = this.scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            processCommand(input);
            System.out.println();
        }
        System.out.println("Bye bye!");
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            this.add();
        } else if (command.equals("search")) {
            this.search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.println("Word: ");
        String word = this.scanner.nextLine();
        System.out.println("Translation: ");
        String translation = this.scanner.nextLine();
        this.dictionary.add(word, translation);
    }

    public void search() {
        System.out.println("To be translated: ");
        String word = this.scanner.nextLine();

        if (this.dictionary.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + this.dictionary.translate(word));
        }
    }
}
