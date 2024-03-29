package DomZad;
import java.util.LinkedList;
import java.util.List;

/*
Исправь четыре ошибки
*/

public class JR_20_6_10 {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();
        initList(list);
        printListValues(list);
        processCastedObjects(list);
    }

    private static void processCastedObjects(List<Number> list) {
        for (Number object : list) {
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }
    }

    private static void printListValues(List<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void initList(List<Number> list) {
        list.add(1000f);
       // list.add("123e-445632");
        list.add(-90 / -3);
        list.remove("123e-445632");
    }
}
