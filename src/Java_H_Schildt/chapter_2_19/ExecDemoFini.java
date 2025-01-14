package Java_H_Schildt.chapter_2_19;

// Ожидать окончания работы notepad.
public class ExecDemoFini {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("notepad");
            p.waitFor();
        } catch (Exception e) {
            System.out.println("Ошибка при выполении notepad.");
        }
        System.out.println("Программа notepad возвратила " + p.exitValue());
    }
}
