package Java_H_Schildt.chapter_2_21;
// Демонстрация использования классов Timer и TimerTask.

import java.util.*;

public class MyTimerTask extends TimerTask {
    public void run() {
        System.out.println("Выполняется задача таймера.");
    }
}

class Ttest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();
        /* Установить начальную задержку в одну секунду
        и затем повторять каждые полсекунды.
         */
        myTimer.schedule(myTask, 1000, 500);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException exc) {
        }
        myTimer.cancel();
    }
}
