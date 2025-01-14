package Java_H_Schildt.chapter_1_17;

// Использование традиционного оператора switch для установки
// уровня приоритета на основе кода события.
public class TraditionalSwitch {
    public static void main(String[] args) {
        int priorityLevel;
        int eventCode = 6010;
        // Традиционный оператор switch, который предоставляет
        // значение, ассоциированное с case.
        switch (eventCode) {
            case 1000: // в традиционном операторе switch используется
                // укладка операторов case
            case 1205:
            case 8900:
                priorityLevel = 1;
                break;
            case 2000:
            case 6010:
            case 9128:
                priorityLevel = 2;
                break;
            case 1002:
            case 7023:
            case 9300:
                priorityLevel = 3;
                break;
            default: // нормальный приоритет
                priorityLevel = 0;
        }
        System.out.println("Уровень приоритета для кода сыбытия " +
                eventCode + " равен " + priorityLevel);
    }
}
