package Java_H_Schildt.chapter_1_17;

// Этот код не скомпилируется! Нельзя смешивать операторы case
// с двоеточиями и операторы case со стрелками
public class StatementSwithArrows2 {
    public static void main(String[] args) {
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        char direction = 'R';
        // Использовать операторы case со стрелками в операторе switch.
        // Обратите внимание, что значение не производится.
        switch (direction) {
            case 'L' -> {
                System.out.println("Повернуть налево");
                left++;
            }
            //  case 'R': // ОШибка Смешивать разные стили case не разрешено.
            // System.out.println("Пеовернуть направо");
            // right++;
            // break;
            case 'U' -> {
                System.out.println("Двигаться вверх");
                up++;
            }
            case 'D' -> {
                System.out.println("Двигаться вниз");
                down++;
            }
        }
        System.out.println(right);
    }
}
