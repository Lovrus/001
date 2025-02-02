package Java_H_Schildt.chapter_1_15;

// Пример захвата локальной переменной из объемлющей области видимости.
public interface MyFunc {
    int func(int n);
}

class VarCapture {
    public static void main(String[] args) {
        // Локальная переменная, которая может быть захвачена.
        int num = 10;

        MyFunc myLambda = (n) -> {
            // Использовать num подобным образом разрешено.
            // Переменная num не модифицируется.
            int v = num + n;
            // Однако следующая строка кода недопустима из-за того,
            // что она пытается модифицировать значение num.
            // num++;
            return v;
        };
        // Следующая строка кода тоже вызовет ошибку, потому что
        // она устранит статус переменной num как фактически финальной.
        // num = 9;
    }
}
