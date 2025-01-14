package Java_H_Schildt.chapter_1_16;
// Простые математические функции.

public class SimpleMathFuncs {
    // Выяснить, является ли а делителем b.
    public static boolean isFactor(int a, int b) {
        if ((b % a) == 0) return true;
        return false;
    }

    // Возвратить наименьший положительный делитель, общий для a и b.
    public static int lcf(int a, int b) {
        // разложить на множители, используя положительные значения.
        a = Math.abs(a);
        b = Math.abs(b);
        int min = a < b ? a : b;
        for (int i = 2; i <= min / 2; i++) {
            if (isFactor(i, a) && isFactor(i, b))
                return i;
        }
        return 1;
    }

    // Возвратить наибольший положительный делитель, общий для а и b.
    public static int gcf(int a, int b) {
        // Разложить на множители, используя положительные значения.
        a = Math.abs(a);
        b = Math.abs(b);
        int min = a < b ? a : b;
        for (int i = min / 2; i >= 2; i--) {
            if (isFactor(i, a) && isFactor(i, b))
                return i;
        }
        return 1;
    }
}
