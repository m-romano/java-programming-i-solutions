
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> list = new ArrayList<>();

        list.add(6);
        list.add(10);
        list.add(46);
        list.add(1);
        list.add(99);
        list.add(33);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(list, 0, 33);
        
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
    
}
