package Java_H_Schildt.chapter_1_17;

// Простой пример работы с записями.
// Объявить запись для сотрудника, что приведет к автоматическому
// созданию класса с закрытыми финальными полями, имеющими имена
// name и idNum, а так же с методами доступа name() и idNum().
record Employee(String name, int idNum) {
}

public class RecordDemo {
    public static void main(String[] args) {
        // Создать массив записей Employee.
        Employee[] empList = new Employee[4];
        // Создать список сотрудников с использованием записи Employee.
        // Обратите внимание на способ конструирования каждой записи.
        // Аргументы автоматически присваиваются полям name и idNum
        // в создаваемой записи.
        empList[0] = new Employee("Doe, John", 1047);
        empList[1] = new Employee("Jones, Robert", 1048);
        empList[2] = new Employee("Smith, Rachel", 1049);
        empList[3] = new Employee("Martin, Dave", 1050);
        // Использовать методы доступа к содержимому записи
        // для отображения имен и идентификационных номеров.
        for (Employee e : empList)
            System.out.println("Идентификатором сотрудника " + e.name()
                    + " является " + e.idNum());
    }
}
