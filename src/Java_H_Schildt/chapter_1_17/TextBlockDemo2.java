package Java_H_Schildt.chapter_1_17;

// Использование двойных кавыче в текстовом блоке.
public class TextBlockDemo2 {
    public static void main(String[] args) {
        String str = """
                Внутри текстового блока можно указывать двойные кавычки без необходимости
                в использовнии управляющих последовательностей. Например:
                Он сказал: "На крыше кот".
                Она спросила: "Как он туда попал?"
                """;
        System.out.println(str);
    }
}
