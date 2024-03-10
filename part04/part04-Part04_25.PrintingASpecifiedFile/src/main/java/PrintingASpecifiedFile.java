
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String filename = sc.nextLine();

        try (Scanner file = new Scanner(Paths.get(filename))) {
            while (file.hasNextLine()) {
                String row = file.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
