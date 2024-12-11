package chapter_2_31;
// Демонстрация применения рефлексии.

import java.lang.reflect.*;

public class ReflectionDemo1 {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.awt.Dimension");
            System.out.println("Конструкторы:");
            Constructor<?>[] constructors = c.getConstructors();

        }
    }
}
