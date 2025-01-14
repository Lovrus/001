package Java_H_Schildt.chapter_1_9;

interface Callback {
    void callback(int param);
}

public class Client implements Callback {
    // реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Метод callback(), "
                + " вызываемый со значением " + p);
    }
}
