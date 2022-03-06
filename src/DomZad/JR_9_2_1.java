package DomZad;

import java.util.regex.Pattern;

/*
Восьмеричный конвертер
*/
public class JR_9_2_1 {

    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишите тут ваш код
        int octalNumber = 0;
        if (decimalNumber <= 0) {
            return octalNumber;
        }
        int i = 0;
        while (decimalNumber != 0) {
            octalNumber = (int) (octalNumber + (decimalNumber % 8) * Math.pow(10, i++));
            decimalNumber = decimalNumber / 8;
        }
        return octalNumber;
    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        int decimalNumber = 0;
        if (octalNumber <= 0) {
            return decimalNumber;
        }
        int i = 0;
        while (octalNumber != 0) {
            decimalNumber = (int) (decimalNumber + (octalNumber % 10) * Math.pow(8, i++));
            octalNumber = octalNumber / 10;
        }
        return decimalNumber;
    }
}


