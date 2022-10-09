package DomZad;
/*
Всё, что движется
*/

public class JR_19_2_9 {
    public static void main(String[] args) throws Exception {
    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly canFly);
    }

}
