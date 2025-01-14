package Java_H_Schildt.chapter_1_5;

// Продемонстрировать применение оператора цикла do-while
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("такт " + n);
            n--;
        } while (--n > 0);
    }
}
