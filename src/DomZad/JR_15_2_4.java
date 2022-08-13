package DomZad;
/*
Логирование стек трейса
*/

public class JR_15_2_4 {

    public static void main(String[] args) {
        log("In method");
    }

    public static void log(String text) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String className = element.getClassName();
        String methodName = element.getMethodName();
        String message = className + ": " + methodName + ": " + text;
        System.out.println(message);
    }
}

