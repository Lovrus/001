package chapter_1_12;

public class AutoBox4_1 {
   static Integer iOb = 2;

    public static void main(String[] args) {
        switch (iOb) {
            case 1 -> System.out.println("один");
            case 2 -> System.out.println("два");
            default -> System.out.println("ошибка");
        }
    }
}
