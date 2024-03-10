
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data.txt"));

        while (sc.hasNextLine()) {
            String row = sc.nextLine();
            System.out.println(row);
        }

    }
}
