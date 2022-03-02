package DomZad;

import java.util.Arrays;

/*
Любимые настолки
*/
public class JR_8_2_2 {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        collection[0] = new BoardGame();
        collection[0].name = "Шахматы";

        collection[1] = new BoardGame();
        collection[1].name = "Айкидо";

        collection[2] = new BoardGame();
        collection[2].name = "Винчун";

        collection[3] = new BoardGame();
        collection[3].name = "Карате";

        collection[4] = new BoardGame();
        collection[4].name = "Бокс";


        System.out.println(Arrays.toString(collection));
    }
}

