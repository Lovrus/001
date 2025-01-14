package Java_H_Schildt.chapter_2_31;
// Отображение открытых методов.

import java.lang.reflect.*;

public class ReflectionDemo2 {
    public static void main(String[] args) {
        try {
            A a = new A();
            Class<?> c = a.getClass();
            System.out.println("Открытые методы:");
            Method[] methods = c.getDeclaredMethods();
            for (int i = 0; i < methods.length; i++) {
                int modifiries = methods[i].getModifiers();
                if (Modifier.isPublic(modifiries)) {
                    System.out.println(" " + methods[i].getName());
                }
            }
        } catch (Exception e) {
            System.out.println("Возникло исключение " + e);
        }
    }
}

class A {
    public void a1() {
    }

    public void a2() {
    }

    protected void a3() {
    }

    private void a4() {
    }
}
