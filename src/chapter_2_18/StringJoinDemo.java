package chapter_2_18;

// Демонстрация использования метода join(), определенного в String.
public class StringJoinDemo {
    public static void main(String[] args) {
        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(result);
        result = String.join(", ", "John", "ID#: 569",
                "E-mail: John@HerbSchildt.com");
        System.out.println(result);
    }
}
