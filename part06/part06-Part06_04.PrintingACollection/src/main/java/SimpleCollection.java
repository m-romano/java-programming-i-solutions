
import java.util.ArrayList;
import java.lang.StringBuilder;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }

        StringBuilder outputBuilder = new StringBuilder("The collection " + name + " has ");
        int size = elements.size();

        // Decide the correct word (singular/plural) based on the number of elements
        String elementSize = size == 1 ? "element:" : "elements:";

        // Append the size and the correct word (element/elements) to the StringBuilder
        outputBuilder.append(size).append(" ").append(elementSize);
        for (String element : elements) {

            // For each element, append a new line character followed by the element itself to the StringBuilder
            outputBuilder.append("\n").append(element);
        }

        // Convert the StringBuilder to a String and return it
        return outputBuilder.toString();
    }
}
