package DomZad;
/*
И снова StackTrace
*/

public class JR_15_2_2 {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}

