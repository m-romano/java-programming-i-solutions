
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double value = Double.parseDouble(scan.nextLine());
        double firstTax = (100 + (value-5000) * 0.08);
        double secondTax = (1700 + (value-25000) * 0.10);
        double thirdTax = (4700 + (value-55000) * 0.12);
        double fourthTax = (22100 + (value-200000) * 0.15);
        double fifthTax = (142100 + (value-1000000) * 0.17);

        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value >= 5000 && value < 25000) {
            System.out.println("Tax: " + firstTax);
        } else if (value >= 25000 && value < 55000) {
            System.out.println("Tax: " + secondTax);
        } else if (value >= 55000 && value < 200000) {
            System.out.println("Tax: " + thirdTax);
        } else if (value >= 200000 && value < 1000000) {
            System.out.println("Tax: " + fourthTax);
        } else if (value >= 1000000) {
            System.out.println("Tax: " + fifthTax);
        }


    }
}
