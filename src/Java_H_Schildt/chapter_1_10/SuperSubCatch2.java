package Java_H_Schildt.chapter_1_10;

/*
Здесь ошибка исправлена, и иерархиея ислючений поставлена
в нужную последовательность.
*/
public class SuperSubCatch2 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (ArithmeticException e) {
            // Ошибка: недостижимый код!
            System.out.println("ArithmeticException.");
        } catch (Exception e) {
            System.out.println(
                    "Exception.");
        }
    }
}
