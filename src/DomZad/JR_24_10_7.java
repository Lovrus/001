package DomZad;
/*
Синхронизированные методы
*/

public class JR_24_10_7 {
    private static double param = Math.random();
    private StringBuilder sb = new StringBuilder();

    private static void method0() {
        Double d = method3();
    }

    protected void method1(String param1) {
        JR_24_10_7 solution = new JR_24_10_7();
        JR_24_10_7.method0();
    }

    public void method2(int param1) {
        param1++;
    }

    static synchronized double method3() {
        double random = Math.random();
        param += 40.7;
        return random + param;
    }

    private synchronized void method4() {
        sb.append(1).append(1).append(1).append(1);
    }

    protected void method5(String param2) {
        new StringBuffer().append(param2).append(param2).append(param2);
    }

    public synchronized String method6(int param2) {
        System.out.println("Thinking....");
        method7(5e-2);
        sb = new StringBuilder("Got it!.");
        return sb.toString();
    }

    String method7(double param2) {
        return "" + param2;
    }

    public static void main(String[] args) {

    }
}
