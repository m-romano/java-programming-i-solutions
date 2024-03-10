
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("File: ");
        String filename = sc.nextLine();

        System.out.println("Team:" );
        String team = sc.nextLine();

        int gamesCount = 0;
        int winsCount = 0;
        int lossesCount = 0;
        try (Scanner file = new Scanner(Paths.get(filename))) {
            while (file.hasNextLine()) {
                String row = file.nextLine();
                String[] pieces = row.split(",");

                if (pieces[0].equals(team) || pieces[1].equals(team)) {
                    gamesCount++;

                    /*

                     * Ternary operator to score one team's score (teamScore)
                     * and the opposing team's score ( opponentScore) is the logic that determines.
                     * The ternary operator is ?:, which evaluates the condition and returns the first value if
                     * the condition is true and the second value if it is false.
                     */
                    int teamScore = pieces[0].equals(team) ? Integer.parseInt(pieces[2]) : Integer.parseInt(pieces[3]);
                    int opponentScore = pieces[0].equals(team) ? Integer.parseInt(pieces[3]) : Integer.parseInt(pieces[2]);

                    if (teamScore > opponentScore) {
                        winsCount++;
                    } else {
                        lossesCount++;
                    }
                }

            }
            System.out.println("Games: " + gamesCount);
            System.out.println("Wins: " + winsCount);
            System.out.println("Losses: " + lossesCount);
        } catch (NoSuchFileException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred!");
            e.printStackTrace();
        }


    }

}
