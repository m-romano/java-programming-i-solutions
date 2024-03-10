
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        System.out.println("Give a string:");
        String stringValue = scan.nextLine();

        System.out.println("Give an integer:");
        int integerValue = Integer.parseInt(scan.nextLine());

        System.out.println("Give a double:");
        double doubleValue = Double.parseDouble(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean booleanValue = Boolean.parseBoolean(scan.nextLine());

        System.out.println("You gave the string " + stringValue);
        System.out.println("You gave the integer " + integerValue);
        System.out.println("You gave the double " + doubleValue);
        System.out.println("You gave the boolean " + booleanValue);

    }
}
