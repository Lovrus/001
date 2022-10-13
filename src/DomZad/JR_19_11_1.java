package DomZad;
/*
Некорректные строки
*/

public class JR_19_11_1 {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";
    }

    interface Button extends SimpleObject {
        String NAME = "Submit";

        String onPress(Object o);

    }
}
