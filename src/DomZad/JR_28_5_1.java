package DomZad;
import java.util.HashSet;
import java.util.Set;

/*
Equals and HashCode
*/

public class JR_28_5_1 {
    private final String first, last;

    public JR_28_5_1 (String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JR_28_5_1)) return false;

        JR_28_5_1 solutions = (JR_28_5_1) o;

        if (first != null ? !first.equals(solutions.first) : solutions.first != null) return false;
        return last != null ? last.equals(solutions.last) : solutions.last == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<JR_28_5_1> s = new HashSet<>();
        s.add(new JR_28_5_1("Donald", "Duck"));
        System.out.println(s.contains(new JR_28_5_1("Donald", "Duck")));
    }
}
