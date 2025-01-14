package Java_H_Schildt.chapter_1_3;

public class Scope {
    public static void main(String[] args) {
        int x; // эта переменная доступна всему
        // коду из метода main()
        x = 10;
        if (x == 10) {// начало новой обалсти действия,
            int y = 20; // доступной только этому блоку кода
            // обе переменные x и y доступны в
            // этой области действия
            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // ОШИБКА! переменная y недоступна
        //в этой области действия, тогда как
        // переменная x лрсиупна и здесь
        System.out.println("x равно " + x);
    }
}