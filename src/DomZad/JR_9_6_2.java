package DomZad;
/*
String.format()
*/
public class JR_9_6_2 {

    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Меня зовут %s. Я буду зарабатывать $%d в месяц.";
        return String.format(phrase, name, salary);
    }
}


