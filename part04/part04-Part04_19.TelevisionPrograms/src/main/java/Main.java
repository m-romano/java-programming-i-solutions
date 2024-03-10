import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Name:");
            String programName = scanner.nextLine();

            if (programName.isEmpty()) {
                break;
            }

            System.out.println("Duration:");
            int programDuration = Integer.parseInt(scanner.nextLine());

            programs.add(new TelevisionProgram(programName, programDuration));
        }

        System.out.println("Program's maximum duration?:");
        int programMaximumDuration = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= programMaximumDuration) {
                System.out.println(program);
            }
        }

    }
}
