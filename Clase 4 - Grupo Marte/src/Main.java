import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Guess> guesses = new ArrayList();
        guesses.add(new Guess("Miriam"));
        guesses.add(new Guess("Rodrigo"));
        guesses.add(new Guess("Fer"));

        Event event = new Event(guesses);

        event.splitCake(guesses);
        event.burstFireworks();

    }

}
