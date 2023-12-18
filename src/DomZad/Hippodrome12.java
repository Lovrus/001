package DomZad;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome12 {
    static Hippodrome12 game;
    private List<Horse12> horses;

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (Horse12 horse : horses) {
            horse.move();
        }
    }

    void print() {
        for (Horse12 horse : horses) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Hippodrome12(List<Horse12> horses) {
        this.horses = horses;
    }

    public List<Horse12> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome12(new ArrayList<>());
        game.getHorses().add(new Horse12("Lucky", 3, 0));
        game.getHorses().add(new Horse12("Slevin", 3, 0));
        game.getHorses().add(new Horse12("Homer", 3, 0));

        game.run();
    }
}
