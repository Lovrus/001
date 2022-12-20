package DomZad;
/*
My second thread
*/

public class JR_22_3_2 {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    public static class TestThread extends Thread {
        static {
            System.out.println("it's a static block inside TestThread");
        }

        public void run() {
            System.out.println("it's a run method");
        }
    }
}
