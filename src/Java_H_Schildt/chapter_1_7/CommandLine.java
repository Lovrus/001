package Java_H_Schildt.chapter_1_7;

// Вывести все аргументы командной строки
public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }
}
