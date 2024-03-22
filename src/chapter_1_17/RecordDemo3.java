package chapter_1_17;

// Ипользование неканонического конструктора в записи.
// Объявить запись для сотрудника, в которой явно объявляются
// канонический и неканонический конструкторы.
record Employee3(String name, int idNum) {
    // Использовать статическое поле в записи.
    static int pendingID = -1;

    // Использовать компактный канонический конструктор для удаления
    // любых ведущих и завершающих пробелов из строки имени.
    public Employee3 {
        // Удалить любые ведущие и завершающие пробелы.
        name = name.trim();
    }

    // Это не канонический конструктор. Обратите внимание,
    // что для создания записи он передает каноническому конструктору
    // не идентификационный номер, а pendingID.
    public Employee3(String name) {
        this(name, pendingID);
    }
}

public class RecordDemo3 {
    public static void main(String[] args) {
        Employee3[] empList = new Employee3[4];
        // Создать список сотрудников с использованием записи Employee3.
        empList[0] = new Employee3("Doe, John", 1047);
        empList[1] = new Employee3("Jones, Robert", 1048);
        empList[2] = new Employee3("Smith, Rachel", 1049);
        // Ожидающий идентификационный номер.
        empList[3] = new Employee3("Martin, Dave");
        // Отобразить имена и идентификационные номера.
        for (Employee3 e : empList) {
            System.out.println("Идентификатором сотрудника " + e.name()
                    + " является ");
            if (e.idNum() == Employee3.pendingID) System.out.println("ожидающий");
            else System.out.println(e.idNum());
        }
    }
}
