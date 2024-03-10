
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        String row = "";
        try (Scanner filename = new Scanner(Paths.get(file))) {
            while (filename.hasNextLine()) {
                row = filename.nextLine();
                if (row.equals(searchedFor)) {
                    System.out.println("Found");
                    break;
                }
            }
            if (!row.equals(searchedFor)) {
                System.out.println("Not found.");
            }
        } catch (NoSuchFileException e) {
            System.out.println("Reading the file " + file + " failed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }

    }
}
