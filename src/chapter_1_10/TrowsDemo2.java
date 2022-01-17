package chapter_1_10;

// Эта программа написано верно
public class TrowsDemo2 {
    static void trowOne() throws IllegalAccessException {
        System.out.println("В теле метода trowone().");
        throw new IllegalAccessException("Демонстрация");
    }

    public static void main(String[] args) {
        try {
            trowOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
