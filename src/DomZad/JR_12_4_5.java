package DomZad;
/*
Задача №3 на преобразование целых типов
*/

public class JR_12_4_5 {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int) ((byte) i + f);
        System.out.println(b);
    }
}
