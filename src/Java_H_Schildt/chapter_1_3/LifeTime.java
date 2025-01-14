package Java_H_Schildt.chapter_1_3;

public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1; // переменная у иницилизируется при
            // каждом вхождении в блок кода
            System.out.println("у равно: " + y);
            // здесь всегда выводится значение -1
            y = 100;
            System.out.println("у теперь равно: " + y);
        }
    }
}
