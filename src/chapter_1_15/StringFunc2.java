package chapter_1_15;
// Использование лямбда-выражений в качестве аргумента метода.
public interface StringFunc2 {
    String func (String n);
}
class LambdaAsArgumentsDemo {
    // Типом первого параметра этого метода яввляется функциональный интерфейс.
    //Таким образом, ему можно передать ссылку на любой экземпляр реализации
    // данного интерфейса, в том числе экземпляр, созданный лямбда-выражением.
    // Во втором парамеетре указывается строка, с которой нужно работать.
    static String stringOp (StringFunc2 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;
        System.out.println("Исходная строка : " + inStr);
        // Простое одиночное лямбда-выражение, которое переводит
        //в верхний регистр строку, переданную методу stringOp().
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Строка в верхнем регистре: " + outStr);
        // Передать блочное лямбда-выражение, которое удаляет пробелы.
        outStr = stringOp((str) -> {
            String result = "";
            int i;
            for (i = 0; i<str.length(); i++)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);
            return result;
        }, inStr);
        System.out.println("Строка после удаления пробелов: " + outStr);
        // Конечно, можно также передавать экземпляр StringFunc2, заблаговременно
        // созданный лямбда-выражением. Например, после выполнения следующего
        // объявления reserve будет ссылаться на экземпляр StringFunc2.
        StringFunc2 reserve = (str) -> {
            String result = "";
            int i;
            for (i = str.length()-1; i>=0; i--)
                result += str.charAt(i);
            return result;
        };
        // Теперь reserve можно передать в первом параметре етоду stringOp(),
        // поскольку этот параметр является ссылкой на объект StringFunc2.
        System.out.println("Строка с противоположным порядком следования символов: " + stringOp(reserve, inStr));
    }
}