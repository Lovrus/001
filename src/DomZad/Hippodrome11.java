package DomZad;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome11 {
    static Hippodrome11 game;
    private List<Horse> horses;

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (Horse11 horse : horses) {
            horse.move();
        }
    }

    void print() {
        for (Horse11 horse : horses) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Hippodrome11(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse11> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome11(new ArrayList<>());
        game.getHorses().add(new Horse11("Lucky", 3, 0));
        game.getHorses().add(new Horse11("Slevin", 3, 0));
        game.getHorses().add(new Horse11("Homer", 3, 0));

        game.run();
    }
}
