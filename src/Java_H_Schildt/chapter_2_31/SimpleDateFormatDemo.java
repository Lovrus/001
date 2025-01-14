package Java_H_Schildt.chapter_2_31;

import java.text.*;
import java.util.*;

// Демонстрация использования SimpleDateFormat
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("E MMM dd yyy");
        System.out.println(sdf.format(date));
    }
}
