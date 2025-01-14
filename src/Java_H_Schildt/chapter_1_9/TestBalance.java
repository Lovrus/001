package Java_H_Schildt.chapter_1_9;

public class TestBalance {
    public static void main(String[] args) {
        /* Класс Balance объявлен как public, поэтому им можно
        воспользоваться и вызвать его конструктор */
        Balance2 test = new Balance2("J. J. Jaspers", 99.98);

        test.show(); // можно так же вызвать метод show()
    }
}
