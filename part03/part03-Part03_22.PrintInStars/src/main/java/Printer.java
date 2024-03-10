import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        IntStream.of(array).forEach(i -> {
            IntStream.range(0, i).forEach(j -> System.out.print("*"));
            System.out.println();
        });
    }

}
