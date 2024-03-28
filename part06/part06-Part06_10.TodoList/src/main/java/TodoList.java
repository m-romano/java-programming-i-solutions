import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks = new ArrayList<>();

    public TodoList() {
        this.tasks = new ArrayList<String>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        int index = 1;
        for (String task : this.tasks) {
            System.out.println(index + ": " + task);
            index += 1;
        }
    }

    public void remove(int number) {
        int index = number - 1;
        this.tasks.remove(index);
    }
}
