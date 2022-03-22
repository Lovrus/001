package DomZad;

/*
Удаление пробелов
*/
public class JR_9_10_2 {

    public static void main(String[] args) {
        String stringWithoutSpaces = deleteSpaces("Добрый день! Как дела?");
        System.out.println(stringWithoutSpaces);
    }

    public static String deleteSpaces(String string) {
        return string.replace(" ", "");
    }
}

