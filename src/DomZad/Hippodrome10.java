package DomZad;
import java.util.ArrayList;
import java.util.List;

public class Hippodrome10 {
    static Hippodrome10 game;
    private List<Horse10> horses;

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (Horse10 horse : horses) {
            horse.move();
        }
    }

    void print() {
        for (Horse10 horse : horses) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Hippodrome10(List<Horse10> horses) {
        this.horses = horses;
    }

    public List<Horse10> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome10(new ArrayList<>());
        game.getHorses().add(new Horse10("Lucky", 3, 0));
        game.getHorses().add(new Horse10("Slevin", 3, 0));
        game.getHorses().add(new Horse10("Homer", 3, 0));
    }
}