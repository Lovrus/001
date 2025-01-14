package Java_H_Schildt.chapter_1_10;

// Продемонстрировать многократный перехват
public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int vals[] = {1, 2, 3};

        try {
            int result = a / b; // Сгенерировать исключение
            // типа ArithmeticException
            // vals[10] = 19; // сгенерироваь иключение
            // типа ArrayIndexOutOfBoundsException
            // В этом операторе catch перехватываются
            // оба исключения
        } catch (ArithmeticException |
                 ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение перевачено: " + e);
        }
        System.out.println("После многократного перехвата.");
    }
}
