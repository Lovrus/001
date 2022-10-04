package DomZad;
/*
Родитель класса CTO
*/

public class JR_18_12_9 {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static class Worker {
        public void workHard() {
        }
    }

    public interface Businessman {
        void workHard();
    }

    public static class CTO extends Worker implements Businessman {

    }
}
