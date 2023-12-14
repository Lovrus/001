package DomZad;

import java.util.ArrayList;
import java.util.List;

/*
Horse Racing
*/

public class JR_23_5_2 {

    public static void main(String[] args) throws InterruptedException {
        List<Horse25> horses = prepareHorsesAndStart(10);
        while (calculateHorsesFinished(horses) != horses.size()) {
        }
    }

    public static int calculateHorsesFinished(List<Horse25> horses) throws InterruptedException {
        int finishedCount = 0;
        for (Horse25 horse : horses) {
            if (horse.isFinished()) {
                finishedCount++;
            } else {
                System.out.println("Waiting for " + horse.getName());
                horse.join();
            }
        }
        return finishedCount;
    }

    public static List<Horse25> prepareHorsesAndStart(int horseCount) {
        List<Horse25> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse25("Horse_" + number));
        }

        System.out.println("All horses start the race!");
        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }
}

class Horse25 extends Thread {

    private boolean isFinished;

    public Horse25(String name) {
        super(name);
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void run() {
        String s = "";
        for (int i = 0; i < 1001; i++) {   // Задержка
            s += "" + i;
            if (i == 1000) {
                isFinished = true;
                s = " has finished the race!";
                System.out.println(getName() + s);
            }
        }
    }
}
