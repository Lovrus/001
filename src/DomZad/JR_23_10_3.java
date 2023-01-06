package DomZad;
/*
Снова interrupt
*/

public class JR_23_10_3 {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread t = new TestThread();
        t.start();
        t.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        public void run() {
        }
    }
}
