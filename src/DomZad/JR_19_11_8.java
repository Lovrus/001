package DomZad;

import java.awt.*;

/*
 метод в классе
*/

public class JR_19_11_8 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
