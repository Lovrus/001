package DomZad;

import java.util.HashSet;
import java.util.Set;

/*
Исправить ошибку. Сравнение объектов
*/

public class JR_28_05_2 {
    private final String first, last;

    public JR_28_05_2(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;

        JR_28_05_2 solution5 = (JR_28_05_2) o;

        if (first != null ? !first.equals(solution5.first) : solution5.first != null) return false;
        return last != null ? last.equals(solution5.last) : solution5.last == null;
    }

    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<JR_28_05_2> s = new HashSet<>();
        s.add(new JR_28_05_2("Mickey", "Mouse"));
        System.out.println(s.contains(new JR_28_05_2("Mickey", "Mouse")));
    }
}
