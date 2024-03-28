import java.util.Scanner;

public class UserInterface {
    private TodoList tasks;
    private Scanner scanner;

    public UserInterface(TodoList tasks, Scanner scanner) {
        this.tasks = tasks;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = this.scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }

            processCommand(input);
            System.out.println();
        }
    }

    public void processCommand(String command) {
        switch (command) {
            case "add":
                this.add();
                break;
            case "list":
                this.list();
                break;
            case "remove":
                this.remove();
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
    }


    public void add() {
        System.out.println("To add: ");
        String task = this.scanner.nextLine();
        this.tasks.add(task);
    }

    public void list() {
        tasks.print();
    }

    public void remove() {
        System.out.println("Which one is removed?");
        int id = Integer.parseInt(this.scanner.nextLine());
        this.tasks.remove(id);
    }
}
