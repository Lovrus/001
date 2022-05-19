package DomZad;
import java.util.ArrayList;

/*
5 различных строк в списке
*/

public class JR_13_2_1 {

    public static ArrayList<String> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list.size());
        for (String string : list) {
            System.out.println(string);
        }
    }
}

