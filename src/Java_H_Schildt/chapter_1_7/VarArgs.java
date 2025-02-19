package Java_H_Schildt.chapter_1_7;

// Продемонстрировать применение аргументов
// переменной длины
public class VarArgs {
    // теперь метод vaTest() объявляется с аргументами
    // переменной длины
    static void vaTest(int... v) {
        System.out.print("Количество аргументов:" +
                +v.length + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Обратите внимание на возможные способы вызова
        // метода vaTest() с аргументами переменной длины
        vaTest(10);// 1 аргумент
        vaTest(1, 2, 3); // 3 аргумента
        vaTest(); // без аргументов
    }
}
