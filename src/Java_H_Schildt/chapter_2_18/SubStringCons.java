package Java_H_Schildt.chapter_2_18;

// Создание строки из поддиапазона массива байтов.
public class SubStringCons {
    public static void main(String[] args) {
        byte[] asii = {65, 66, 67, 68, 69, 70};
        String s1 = new String(asii);
        System.out.println(s1);
        String s2 = new String(asii, 2, 3);
        System.out.println(s2);
    }
}
