package DomZad;
import java.util.ArrayList;
import java.util.List;

public class Hippodrome7 {
    static Hippodrome7 game;
    private List<Horse7> horses;

    void run() {

    }

    void move() {

    }

    void print() {

    }

    public Hippodrome7(List<Horse7> horses) {
        this.horses = horses;
    }

    public List<Horse7> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome7(new ArrayList<>());
        game.getHorses().add(new Horse7("Lucky", 3, 0));
        game.getHorses().add(new Horse7("Slevin", 3, 0));
        game.getHorses().add(new Horse7("Homer", 3, 0));
    }
}