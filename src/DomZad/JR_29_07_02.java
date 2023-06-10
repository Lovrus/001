package DomZad;
/*
МНЕ нравится курс JavaRush
*/

public class JR_29_07_02 {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), "JavaRush", "курс", "мне", "нравится"));
        //должен быть вывод
        //"МНЕ нравится курс JavaRush"
    }

    public static String getFormattedString() {
        return "%3$2S %4$2s %2$2s %1$2s";
    }
}
