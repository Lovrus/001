package chapter_1_9;

// Еще одна реализация интерфейса Callback
public class AnotherClient implements Callback2 {
    // реализовать интерфейс Callback
    public void callback3(int p) {
        System.out.println(
                "Еще один вариант метода callback()");
        System.out.println("р в квадрате равно " + (p * p));
    }

    @Override
    public void callback2(int param) {

    }
}
