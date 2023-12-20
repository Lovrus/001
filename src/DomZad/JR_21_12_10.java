package DomZad;
/*
Порядок загрузки переменных
*/

public class JR_21_12_10 {
    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    static {
        init();
    }

    public int i = 6;
    public String name = "First name";

    public JR_21_12_10() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    static {
        System.out.println("Static block");
    }

    public static void printAllFields(JR_21_12_10 obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
