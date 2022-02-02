package chapter_1_11;

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
    private static String[] args;

    public static void main(String[] args) {
        Synch.args = args;
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Добро пожаловать");
        Caller ob2 = new Caller(target,
                "в синхрозинированный");
        Caller ob3 = new Caller(target, "мир!");

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