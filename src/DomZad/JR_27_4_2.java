package DomZad;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
Как сериализовать JavaRush?
*/

public class JR_27_4_2 {
    public static class JavaRush implements Serializable {
        public List<User2> users = new ArrayList<>();
    }

    public static void main(String[] args) {

    }
}
