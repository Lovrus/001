package chapter_1_16;

// AbsPlus предоставляет конкретную реализацию BinaryFunc,
// которая возвращает результат abs(a) - abs(b).
public class AbsPlus implements BinaryFunc {
    // Возвратить имя этой функции.
    public String getName() {
        return "absPlus";
    }

    // Реализовать функцию AbsPlus.
    public int func(int a, int b) {
        return Math.abs(a) + Math.abs(b);
    }
}
