package Java_H_Schildt.chapter_1_4;

// Продемонстрировать применине тернарной операции ?
public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; // получить абсолютное
                            // значение переменной i
        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i; // получить абсолютное
                            // значение переменной i
        System.out.print("Абсолютное значение");
        System.out.println(i + " равно " + k);
    }
}
