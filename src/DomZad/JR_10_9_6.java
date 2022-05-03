package DomZad;

/*
Количество слов в строке
*/
public class JR_10_9_6 {

    public static void main(String[] args) {
        String string = "Кто желает поработать?";
        int getWordCount = getWordCount(string);
        System.out.println("Количество слов в строке \"" + string + "\" равно " + getWordCount);
    }

    public static int getWordCount(String string) {
        return string.split(" ").length;
    }
}

