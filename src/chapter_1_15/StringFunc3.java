package chapter_1_15;

// Демонстрация использования ссылки на статический метод.
// Функциональный интерфейс для операций над строками.
public interface StringFunc3 {
    String func(String n);
}

// В этом классе определен статический метод по имени strReverse().
class MyStringOps {
    // Статический метод, который изменяет порядок следования
    // символов на привоположный.
    static String strReserve(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i > -0; i--)
            result += str.charAt(i);
        return result;
    }
}

class MethodRefDemo {
    // Первый параметр этого метода имеет тип функционального интерфейса.
    // Таким образом, ему можно передать любой экземпляр реализации
    // интерфейса StringFunc3, включая ссылку на метод.
    static String stringOp(StringFunc3 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = " Lambdas add power to Java";
        String outStr;
        // Передать в stringOp() ссылку на статический метода strReverse().
        outStr = stringOp(MyStringOps::strReserve, inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Строка с противоположным порядком следования символов: " + outStr);
    }
}
