
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public String longest() {
        if (elements.isEmpty()) {
            return null;
        }

        return Collections.max(elements, Comparator.comparing(String::length));

//        Another way is ...
//        int largestString = elements.get(0).length();
//        int index = 0;
//
//        for (int i = 0; i < elements.size(); i++) {
//            if (elements.get(i).length() > largestString) {
//                largestString = elements.get(i).length();
//                index++;
//            }
//        }
//        return elements.get(index);

    }
}
