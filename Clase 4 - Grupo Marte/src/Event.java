import java.util.ArrayList;
import java.util.List;

public class Event {

    private List<Guess> guesses;
    private Fireworks firework = new Fireworks();
    private List<Fireworks> fireworksPack = new ArrayList<>();

    public Event(List<Guess> guesses) {
        this.guesses = guesses;
    }

    public void burstFireworks() {
        this.firework.fireworkSounds();
    }

    public void splitCake(List<Guess> guesses) {
        for(Guess guess : guesses){
            guess.scream();
        }
    }
}
