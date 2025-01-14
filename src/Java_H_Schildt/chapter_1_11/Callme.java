package Java_H_Schildt.chapter_1_11;

// Эта программа не синхронизирована
class Callme {
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target2;
    Thread t;

    public Caller(Callme targ, String s) {
        target2 = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        target2.call(msg);
    }
}

class Synch {

    public static void main(String[] args) {

        Callme target2 = new Callme();
        Caller ob1 = new Caller(target2, "Добро пожаловать");
        Caller ob2 = new Caller(target2,
                "в синхрозинированный");
        Caller ob3 = new Caller(target2, "мир!");

        // ожидать завершения потока исполнения
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}
