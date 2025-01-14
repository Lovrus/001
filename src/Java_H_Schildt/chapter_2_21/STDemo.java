package Java_H_Schildt.chapter_2_21;
// Демонстрация работы StringTokenizer.

import java.util.StringTokenizer;

public class STDemo {
    static String in = "title=Java: The Comlete Reference;" +
            "author=Schildt;" +
            "publisher=McGraw Hill;" +
            "copyrignt=2022";

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(in, "=;");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
