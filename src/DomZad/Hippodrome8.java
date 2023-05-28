package DomZad;
import java.util.ArrayList;
import java.util.List;

public class Hippodrome8 {
    static Hippodrome8 game;
    private List<Horse8> horses;

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {

    }

    void print() {

    }

    public Hippodrome8(List<Horse8> horses) {
        this.horses = horses;
    }

    public List<Horse8> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome8(new ArrayList<>());
        game.getHorses().add(new Horse8("Lucky", 3, 0));
        game.getHorses().add(new Horse8("Slevin", 3, 0));
        game.getHorses().add(new Horse8("Homer", 3, 0));
    }
}