package DomZad;

public class Queen {
    // JR_8_1_1
    public static Worker[] workers;
    public static Soldier[] soldiers;

    public static void main(String[] args) {
        populate();
        for (int i = 0; i < workers.length; i++) {
            Worker worker = workers[i];
            worker.sendForFood();
        }

        for (int i = 0; i < soldiers.length; i++) {
            Soldier soldier = soldiers[i];
            soldier.sendIntoBattle();
        }

        //напишите тут ваш код

    }

    public static void populate() {
        workers = new Worker[800];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
        }

        soldiers = new Soldier[70];
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i] = new Soldier();
        }
    }
}

