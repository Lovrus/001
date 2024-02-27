package chapter_1_15;

// Блочное лямбда-выражение, которое изменяет порядок
// следования символов в строке на привоположный.
public interface StringFunc {
    String func(String n);
}

class BlockLambdaDemo2 {
    public static void main(String[] args) {
        // Это блочное лямбда-выражение изменяет порядок
        // следования символов в строке на противоположный.
        StringFunc reserve = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("Строка Lambda с противоположным порядком следования символов: "
                + reserve.func("Lambda"));
        System.out.println("Строка Expression с противоположным порядком следования символов: " +
                reserve.func("Expression"));
    }
}
