package Java_H_Schildt.chapter_2_18;

// Демонстрация работы delete() и deleteCharAt().
public class deleteDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Строка для тестирования.");
        sb.delete(6, 10);
        System.out.println("После dekete(): " + sb);
        sb.deleteCharAt(0);
        System.out.println("После deleteCharAt(): " + sb);
    }
}
