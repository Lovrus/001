package Java_H_Schildt.chapter_1_17;

// Преобразование оператора switch в выражение switch.
public class SwitchExpr {
    public static void main(String[] args) {
        int eventCode = 6010;
        // Это выражение switch. Обратите внимание на то, как его значение
        // присваевается переменной priorityLevel, а также на то,
        // что значение switch предоставляется оператором yield.
        int priorityLevel = switch (eventCode) {
            case 1000, 1205, 8900:
                yield 1;
            case 2000, 6010, 9128:
                yield 2;
            case 1002, 7023, 9300:
                yield 3;
            default: // нормальный приоритет
                yield 0;
        };
        System.out.println("Уровень приоритета для кода события "
                + eventCode + " равен " + priorityLevel);
    }
}
