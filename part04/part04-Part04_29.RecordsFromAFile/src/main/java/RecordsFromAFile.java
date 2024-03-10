
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String filename = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try (Scanner file = new Scanner(Paths.get(filename))) {
            while (file.hasNextLine()) {
                String row = file.nextLine();
                list.add(row);

                String[] pieces = row.split(",");
                if (Integer.parseInt(pieces[1]) == 1) {
                    System.out.println(pieces[0] + ", age: " + pieces[1] + " year");
                } else {
                    System.out.println(pieces[0] + ", age: " + pieces[1] + " years");
                }
            }
        } catch (NoSuchFileException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }

    }
}
