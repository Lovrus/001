package DomZad;
/*
Вспомним наследование
*/

public class JR_31_9_2 extends C {
    private class A {
        protected String value = "A";

        public A() {
            System.out.print(value);
        }
    }

    private A a = new A() {
        { //у анонимных классов нет своих конструкторов, но что-то можно сделать в блоке инициализации класса
            value = "Y";
            if (super.getClass().getName().contains(".Solution$")) {
                System.out.print(value);
            }
        }
    };

    public JR_31_9_2() {
        System.out.print("S");
    }

    public static void main(String[] args) {
        new JR_31_9_2();
    }
}