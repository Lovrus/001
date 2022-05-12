package DomZad;
import java.util.ArrayList;
import java.util.List;

/*
Почувствуй себя деканом
*/

public class JR_11_6_5 {
    public List<String> students;

    public JR_11_6_5() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(excludedStudent)) {
                students.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        JR_11_6_5 universityGroup = new JR_11_6_5();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}

