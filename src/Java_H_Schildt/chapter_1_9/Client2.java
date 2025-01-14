package Java_H_Schildt.chapter_1_9;

interface Callback2 {
    void callback2(int param);

    public class Client2 implements Callback2 {
        // реализовать интерфейс Callback
        public void callback2(int p) {
            System.out.println("Метод callback(), "
                    + " вызываемый со значением " + p);
        }

        void nonIfaceMeth() {
            System.out.println("В классах, реализующих интерфейсы,"
                    + " могут опрделяться и другие члены.");
            System.out.println(" Это замечательно.");
        }
    }
}

