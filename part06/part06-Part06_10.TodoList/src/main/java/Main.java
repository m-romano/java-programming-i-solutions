
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        Scanner scanner = new Scanner(System.in);
        TodoList todolist = new TodoList();

        UserInterface ui = new UserInterface(todolist, scanner);
        ui.start();

    }
}
