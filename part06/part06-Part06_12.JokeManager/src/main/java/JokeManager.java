import java.util.ArrayList;
import java.util.Collections;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<String>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }

        Collections.shuffle(this.jokes);
        return this.jokes.get(0);

    }

    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }
}
