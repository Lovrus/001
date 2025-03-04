package Java_H_Schildt.chapter_1_17;

// Использование операторов case со стрелками в операторе switch.
public class StatementSwithArrows {
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
            case 'R' -> {
                System.out.println("Пеовернуть направо");
                right++;
            }
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
