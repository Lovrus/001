package DomZad;
/*
Создаем свои исключения
*/

public class JR_15_8_6 {
    public static void main(String[] args) {
    }

    static class MyException extends Throwable {
    }

    static class MyException2 extends ClassNotFoundException {
    }

    static class MyException3 extends RuntimeException {
    }

    static class MyException4 extends IllegalStateException {
    }
}
