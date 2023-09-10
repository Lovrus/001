package DomZad;
import java.util.List;

/*
Интернет-магазин продажи джинсов
*/

public class JR_31_6_3 {
    public static List<Jeans> allJeans = Util.getAllJeans();

    public static void main(String[] args) {
        for (Jeans jeans : allJeans) {
            System.out.println(jeans);
        }
    }
}