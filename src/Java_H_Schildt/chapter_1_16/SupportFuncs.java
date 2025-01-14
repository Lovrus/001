package Java_H_Schildt.chapter_1_16;

// Вспомогательные функции.
public class SupportFuncs {
    // Выяснить, является ли а делителем b.
    public static boolean isFactor(int a, int b) {
        if ((b % a) == 0) return true;
        return false;
    }
}
