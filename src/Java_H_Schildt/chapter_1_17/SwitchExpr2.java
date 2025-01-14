package Java_H_Schildt.chapter_1_17;

// Использование "сокращенной" формы со стрелкой
// для предоставления уровня приоритета.
public class SwitchExpr2 {
    public static void main(String[] args) {
        int eventCode = 6010;
        // Обратите внимание в этом выражении switch на то, как значение
        // предоставляется с применением case со стрелкой. Кроме того,
        // для предоствращения сквозного выполнения оператор break
        // не требуется (и не разрешен).
        int priorityLevel = switch (eventCode) {
            case 1000, 1205, 8900 -> 1;
            case 2000, 6010, 9128 -> 2;
            case 1002, 7023, 9300 -> 3;
            default -> 0; // нормальный приоритет
        };
        System.out.println("Уровень приоритета для кода события "
                + eventCode + " равен " + priorityLevel);
    }
}
