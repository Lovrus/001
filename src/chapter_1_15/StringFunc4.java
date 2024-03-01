package chapter_1_15;

// Демонстрация использования ссылки на метод экземпляра.
// Функциональный интерфейс для операций под строками.
public interface StringFunc4 {
    String func(String n);
}

// Теперь в этом классе определен метод экземпляра по имени strReserve().
class MyStringOps2 {
    String strReserve(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}

class MethodRefDemo2 {
    // Первый параметр этого метода имеет тип функционального интерфейса.
    // Таким образом, ему можно передавать любой экземпляр реализации
    // интерфейса StringFunc, включая ссылку на метод.
    static String stringOp(StringFunc4 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;
        // Создать объект MyStringOps.
        MyStringOps2 strOps = new MyStringOps2();
        // Передать в stringOp() ссылку на метод экземпляра strReserve().
        outStr = stringOp(strOps::strReserve, inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Строка с противоположным порядком следования символов: " + outStr);
    }
}
