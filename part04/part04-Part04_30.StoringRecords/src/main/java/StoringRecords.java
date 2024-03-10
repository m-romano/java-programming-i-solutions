
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try (Scanner filename = new Scanner(Paths.get(file))) {
            while (filename.hasNext()) {
                String row = filename.nextLine();
                String[] pieces = row.split(",");

                Person person = new Person(pieces[0], Integer.parseInt(pieces[1]));

                persons.add(person);

            }
        } catch (NoSuchFileException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }
        return persons;

    }
}
