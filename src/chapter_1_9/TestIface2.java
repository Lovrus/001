package chapter_1_9;

public class TestIface2 {
    public static void main(String[] args) {
        Callback2 c = new Callback2.Client2();
        AnotherClient ob = new AnotherClient();

        c.callback2(42);

        c = ob; // теперь переменная с ссылается на
        // объект типа AnotherClient
        c.callback2(42);
    }
}
