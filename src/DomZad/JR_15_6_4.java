package DomZad;
import java.util.ArrayList;

/*
Исключение при работе с коллекциями List
*/

public class JR_15_6_4 {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
