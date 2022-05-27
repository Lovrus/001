package DomZad;
import java.util.ArrayList;

/*
Продолжаем мыть раму
*/

public class JR_13_5_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");

        for (String string : list) {
            System.out.println(string);
        }
    }
}
