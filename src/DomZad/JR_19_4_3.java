package DomZad;
/*
Лисица — это такое животное
*/

import java.awt.*;

public class JR_19_4_3 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
