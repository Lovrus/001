package Java_H_Schildt.chapter_1_17;

public class ABC {
    public static void main(String[] args) {
        String str = """
                A
                  B
                C
            """;  // определяет начало отступа
        String str2 = """
                A
                  B
                C
                """; // никакого влияния не оказывает
        String str3 = """
                A
                  B
                C
               """; // приводит к удалению пробельных символов плоть до """
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
}
