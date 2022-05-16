package DomZad;
/*
Сознательный выбор
*/

public class JR_12_4_3 {

    public static void main(String[] args) {
        System.out.println(isByte(12)); // true
        System.out.println(isShort(130999)); // false
        System.out.println(isInt(1999939990L)); // true
        System.out.println(isInt(19999999939990L)); // false
    }

    public static boolean isByte(long l) {
        return l >= Byte.MIN_VALUE && l <= Byte.MAX_VALUE;
    }

    public static boolean isShort(long l) {
        return l >= Short.MIN_VALUE && l <= Short.MAX_VALUE;
    }

    public static boolean isInt(long l) {
        return l >= Integer.MIN_VALUE && l <= Integer.MAX_VALUE;
    }
}
