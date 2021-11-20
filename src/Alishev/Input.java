package Alishev;

import java.util.Scanner;

//Урок 7. Ввод данных. Класс Scanner
public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите какое нибудь число");
        int x = s.nextInt();
        System.out.println("Вы ввели " + x);
    }
}
