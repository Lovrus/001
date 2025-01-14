package Java_H_Schildt.chapter_2_18;

// Использование reserve() для изменения на противоположный
public class ReserveDemo {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("abcdef");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
