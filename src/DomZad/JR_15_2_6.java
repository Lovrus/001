package DomZad;
/*
Метод возвращает результат – глубину его стек-трейса
*/

public class JR_15_2_6 {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        int deep = Thread.currentThread().getStackTrace().length;
        System.out.println(deep);
        return deep;
    }
}
