package Java_H_Schildt.chapter_1_12;
// Автоупаковка/распаковка значений
// из классов Boolean и Character

public class AutoBox5 {
    public static void main(String[] args) {

        // Автоупаковка/распаковка логического
        // значения типа boolean
        Boolean b = true;

        // объект b автоматически распаковывается,
        // когда он употребляется в условном операторе if
        if (b) System.out.println("b равно true");

        // автоупаковка/распаковка значения типа char
        Character ch = 'x'; // упаковать значение типа char
        char ch2 = ch; // распаковать значение типа char

        System.out.println("ch2 равно " + ch2);
    }
}
