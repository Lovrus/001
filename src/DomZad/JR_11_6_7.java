package DomZad;
/*
Составляем список студентов
*/

public class JR_11_6_7 {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        JR_11_6_7 university = new JR_11_6_7();
        university.addStudent("Максим Федоренко");
        university.addStudent("Олег Кесарчук");
        university.printStudents();
    }
}
