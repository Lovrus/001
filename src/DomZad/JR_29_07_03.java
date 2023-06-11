package DomZad;

import java.util.Date;

/*
Форматирование даты
*/

public class JR_29_07_03 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format(getFormattedString(), date, date, date, date, date, date));
        //должен быть вывод аналогичный следующему
        //31:10:13 15:59:59 - dd:MM:yy hh:mm:ss
    }

    public static String getFormattedString() {
        return "%td:%tm:%ty %tH:%tM:%tS";
    }
}
