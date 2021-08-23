package chapter_1_3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("Преобразование типа int в типа byte.");
        b = (byte) i;
        System.out.println("Преобразование типа double в тип int.");
        i = (int) d;
        System.out.println("d и i " + d + " " + i);
        System.out.println("Преобразование типа double в тип byte.");
        b = (byte) d;
        System.out.println("d и b " + d + " " + b);
    }
}
