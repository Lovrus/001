package DomZad;
import java.util.ArrayList;
import java.util.List;

public class Hippodrome13 {
    static Hippodrome13 game;
    private List<Horse13> horses;

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (Horse13 horse : horses) {
            horse.move();
        }
    }

    void print() {
        for (Horse13 horse : horses) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Hippodrome13(List<Horse13> horses) {
        this.horses = horses;
    }

    public List<Horse13> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome13(new ArrayList<>());
        game.getHorses().add(new Horse13("Lucky", 3, 0));
        game.getHorses().add(new Horse13("Slevin", 3, 0));
        game.getHorses().add(new Horse13("Homer", 3, 0));

        game.run();
    }
}