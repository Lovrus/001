package Java_H_Schildt.chapter_1_7;

// Продемонстировать применение массивов
// объектов типа String
public class StringDemo3 {
    public static void main(String[] args) {
        String str[] = {"один", "два", "три"};

        for (int i = 0; i < str.length; i++)
            System.out.println("str[" + i + "]: " + str[i]);
    }
}
