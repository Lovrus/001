package DomZad;

import java.util.LinkedList;
import java.util.List;

/*
Рефакторинг, анонимные классы
*/

public class JR_31_9_1 {
    public static List<Iterator> iterators = new LinkedList<>();
    private int countItems;

    public Iterator getIterator(final String name) {
        return new Iterator() {
            {
                countItems++;
                System.out.println(name + " item " + countItems);
            }

            public Iterator next() {
                return getIterator(name);
            }
        };
    }

    public static void main(String[] args) {
        JR_31_9_1 solution = new JR_31_9_1();

        Iterator iterator = solution.getIterator("iterator");
        for (int i = 1; i < 5; i++) {
            iterators.add(iterator.next());
        }
    }
}
