package Java_H_Schildt.chapter_2_19;

// Демонстрация работы exec().
public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("notepad");
        } catch (Exception e) {
            System.out.println("Ошибка при выполнении notepad.");
        }
    }
}
