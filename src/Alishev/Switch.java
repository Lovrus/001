package Alishev;

import java.util.Scanner;

// Урок 10. Оператор switch.
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веведи возраст");
        String age = scanner.nextLine();
        switch (age) {
            case "ноль" -> System.out.println("Ты родился");
            case "семь" -> System.out.println("Ты пошел в школу");
            case "восемнадцаь" -> System.out.println("Ты закончил школу");
            default -> System.out.println("Ни одно из предыдущих условия не подошло");
        }
    }
}
