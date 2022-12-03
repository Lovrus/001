package DomZad;
/*
Статики и котики
*/

public class JR_21_9_5 {
    public static Cat21 cat;

    public static void main(String[] args) {

    }

    public static class Cat21 {
        public String name;
    }

    static {
        Solution.cat = new Cat21();
        cat.name = "Пушок";
        System.out.println(cat.name);
    }
}
