package chapter_1_13;
// Неудачное применение оператора assert!!!

public class AssertDemo_2 {
    // получить генератор случайных чисел
    static int val = 3;

    // возвратить целочисленное значение
    static int getnum() {
        return val--;
    }

    public static void main(String[] args) {
        int n = 0;

        for (int i = 0; i < 10; i++) {

            assert (n = getnum()) > 0; // не подтвердится, если n == 0

            System.out.println("n is " + n);
        }
    }
}
