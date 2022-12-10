package DomZad;
import java.math.BigDecimal;

/*
ООП. Перегрузка
*/

public class JR_21_12_7 {
    public static void main(String[] args) {
        //Блок 2.
        //Вызов для Object
        //new Tree2().info((Object) new Integer("4"));
        //new Tree2().info((Object) new Short("4"));
        new Tree2().info((Object) new BigDecimal("4"));

        //Блок 3.
        //Вызов для Number
        //new Tree2().info(new Integer("4"));
        //new Tree2().info(new Short("4"));
        new Tree2().info(new BigDecimal("4"));

        //Блок 4.
        //Вызов для String
        new Tree2().info("4");
        //new Tree2().info(new Integer("4").toString());
        //new Tree2().info(new Short("4").toString());
        new Tree2().info(new BigDecimal("4").toString());
    }
}
