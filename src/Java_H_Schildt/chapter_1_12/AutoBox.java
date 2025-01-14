package Java_H_Schildt.chapter_1_12;

// Продемонстрировать автоупаковку/автораспаковку
public class AutoBox {
    public static void main(String[] args) {

        Integer iOb = 100; // автоупаковка значения типа int

        int i = iOb; // автораспаковка значения типа int

        System.out.println(i + " " + iOb);
        // выводит значения 100 и 100
    }
}
