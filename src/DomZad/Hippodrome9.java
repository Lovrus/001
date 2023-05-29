package DomZad;
import java.util.ArrayList;
import java.util.List;

public class Hippodrome9 {
    static Hippodrome9 game;
    private List<Horse9> horses;

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (Horse9 horse : horses) {
            horse.move();
        }
    }

    void print() {

    }

    public Hippodrome9(List<Horse9> horses) {
        this.horses = horses;
    }

    public List<Horse9> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome9(new ArrayList<>());
        game.getHorses().add(new Horse9("Lucky", 3, 0));
        game.getHorses().add(new Horse9("Slevin", 3, 0));
        game.getHorses().add(new Horse9("Homer", 3, 0));
    }
}