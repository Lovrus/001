package chapter_1_17;

// Использование компактного конструктора записи.
// Объявить запись для сотрудника.
record Employee2(String name, int idNum) {
    // Использование компактного канонического конструктора для удаления
    // любых ведущих и завершающих пробелов из строки имени.
    public Employee2 {
        // Удалить любые ведущие и завершающие пробелы.
        name = name.trim();
    }
}

public class RecordDemo2 {
    public static void main(String[] args) {
        Employee2[] empList = new Employee2[4];
        // Здесь имя не имеет ведущих или завершающих пробелов.
        empList[0] = new Employee2("Doe, John", 1047);
        //  Следующие три имени содержат ведущие и/или завершающие пробеллы.
        empList[1] = new Employee2("Jones, Robert", 1048);
        empList[2] = new Employee2("Smith, Rachel", 1049);
        empList[3] = new Employee2("Martin, Dave", 1050);
        // Использовать методы доступа к содержимому записи для отображения имен
        // и идентификационных номеров. Обратите внимание, что все ведущие и/или
        // завершающие пробелы с помощью конструктора были удалены
        // из компонента name.
        for (Employee2 e : empList)
            System.out.println("Идентификатором сотрудника " + e.name()
                    + " является " + e.idNum());
    }
}
