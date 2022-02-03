package chapter_1_11;
// В этой программе используется синхронизированный блок
public class Callme2 {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}

class Caller2 implements Runnable {
    String msg;
    Callme2 target;
    Thread t;
    public Caller2(Callme2 targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    // синхронизированные вызовы метода call()

}