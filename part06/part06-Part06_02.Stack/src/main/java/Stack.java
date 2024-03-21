import java.util.ArrayList;
public class Stack {
    private ArrayList<String> stacks = new ArrayList<>();

    public boolean isEmpty() {
        return stacks.isEmpty();
    }

    public void add(String value) {
        if (!stacks.contains(value)) {
            stacks.add(value);
        }
    }

    public ArrayList<String> values() {
        return stacks;
    }

    public String take() {
        return stacks.remove(stacks.size() - 1);
    }
}
