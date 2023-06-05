package DomZad;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome16 {
    static Hippodrome16 game;
    private List<Horse16> horses;

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (Horse16 horse : horses) {
            horse.move();
        }
    }

    void print() {
        for (Horse16 horse : horses) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse16 getWinner() {
        Horse16 result = horses.get(0);
        for (Horse16 horse : horses) {
            if (horse.getDistance() > result.getDistance())
                result = horse;
        }
        return result;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public Hippodrome16(List<Horse16> horses) {
        this.horses = horses;
    }

    public List<Horse16> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome16(new ArrayList<>());
        game.getHorses().add(new Horse16("Lucky", 3, 0));
        game.getHorses().add(new Horse16("Slevin", 3, 0));
        game.getHorses().add(new Horse16("Homer", 3, 0));

        game.run();
        game.printWinner();
    }
}
