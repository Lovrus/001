package chapter_1_12;
// Продемонстрировать оболочку числового типа

public class Wrap {
    public static void main(String[] args) {

        Integer iOb = new Integer(100);

        int i = iOb.intValue();

        System.out.println(i + " " + iOb); // выводит значение 100 и 100
    }
}
