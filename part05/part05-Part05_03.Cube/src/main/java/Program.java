
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here

        Cube firstCcube = new Cube(8);
        System.out.println(firstCcube.volume());
        System.out.println(firstCcube);

        System.out.println();

        Cube secondCube = new Cube(2);
        System.out.println(secondCube);

    }
}
