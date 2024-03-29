package DomZad;
/*
Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция
*/

public class JR_23_13_8 {
    public static MyThread t = new MyThread();
    static String message = "inside main ";

    public static void main(String[] a) throws Exception {
        t.start();
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(message + i);
            sleep();
        }
    }

    public static void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    static class MyThread extends Thread {
        String message = "inside MyThread ";

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(message + i);
                JR_23_13_8.sleep();
            }
        }
    }
}
