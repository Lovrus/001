package chapter_1_17;

public class TraditionalSwitch2 {
    public static void main(String[] args) {
        int priorityLevel;
        int eventCode = 6010;
        // В этом операторе switch применяется список констант case.
        switch (eventCode) {
            case 1000, 1205, 8900:
                priorityLevel = 1;
                break;
            case 2000, 6010, 9128:
                priorityLevel = 2;
                break;
            case 1002, 7023, 9300:
                priorityLevel = 3;
                break;
            default: // нормальный приоритет
                priorityLevel = 0;
        }
    }
}
