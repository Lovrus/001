package DomZad;
import java.util.HashSet;
import java.util.Set;

/*
Set из растений
*/

public class JR_14_3_1 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String string : set) {
            System.out.println(string);
        }
    }
}
