package DomZad;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
Сравниваем модификаторы
*/

public class JR_28_02_2 {
    public static void main(String[] args) {
        int classModifiers = Solution.class.getModifiers();
        System.out.println(isModifierSet(classModifiers, Modifier.PUBLIC));   //true
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false

        int methodModifiers = getMainMethod().getModifiers();
        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));      //true
    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
        return (allModifiers & specificModifier) != 0;
    }

    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
