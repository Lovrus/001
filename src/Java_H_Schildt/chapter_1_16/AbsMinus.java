package Java_H_Schildt.chapter_1_16;

// AbsMinus предоставляет конкретную реализацию BinaryFunc,
// которая возвращает результат abs(a) - abs(b).
public class AbsMinus implements BinaryFunc {
    // Возвратить имя этой функции.
    public String getName() {
        return "absMinus";
    }

    // Реализовать функцию AbsMinus.
    public int func(int a, int b) {
        return Math.abs(a) - Math.abs(b);
    }
}
