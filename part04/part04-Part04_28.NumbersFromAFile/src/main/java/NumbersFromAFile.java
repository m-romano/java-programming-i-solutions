
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());

        int count = 0;
        try (Scanner filename = new Scanner(Paths.get(file))) {
            while (filename.hasNextLine()) {
                String row = filename.nextLine();
                int rowToNumber = Integer.parseInt(row);
                if (rowToNumber >= lowerBound && rowToNumber <= upperBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch (NoSuchFileException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }

    }

}
