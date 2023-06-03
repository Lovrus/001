package DomZad;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome14 {
    static Hippodrome14 game;
    private List<Horse14> horses;

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (Horse14 horse : horses) {
            horse.move();
        }
    }

    void print() {
        for (Horse14 horse : horses) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Hippodrome14(List<Horse14> horses) {
        this.horses = horses;
    }

    public List<Horse14> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome14(new ArrayList<>());
        game.getHorses().add(new Horse14("Lucky", 3, 0));
        game.getHorses().add(new Horse14("Slevin", 3, 0));
        game.getHorses().add(new Horse14("Homer", 3, 0));

        game.run();
    }
}
