package DomZad;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome15 {
    static Hippodrome15 game;
    private List<Horse15> horses;

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (Horse15 horse : horses) {
            horse.move();
        }
    }

    void print() {
        for (Horse15 horse : horses) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse15 getWinner() {
        Horse15 result = horses.get(0);
        for (Horse15 horse : horses) {
            if (horse.getDistance() > result.getDistance())
                result = horse;
        }
        return result;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public Hippodrome15(List<Horse15> horses) {
        this.horses = horses;
    }

    public List<Horse15> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome15(new ArrayList<>());
        game.getHorses().add(new Horse15("Lucky", 3, 0));
        game.getHorses().add(new Horse15("Slevin", 3, 0));
        game.getHorses().add(new Horse15("Homer", 3, 0));

        game.run();
    }
}
