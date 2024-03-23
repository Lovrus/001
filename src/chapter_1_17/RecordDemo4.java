package chapter_1_17;

// Использование метода экземпляра в записи.
// В этой версии записи Employee предоставляется метод по имени lastName(),
// который возвращает из компонента name только фамилию.
// Она также содержит версию компактного конструктора, в которой
// производится проверка общепринятого формата "фамилия, имя".
record Employee4(String name, int idMum) {
    // Использование компактного канонического конструктора для удаления
    // любыв ведущих и заверашющихся пробелов в компонента name. Кроме того,
    // реализуется базовая проверка того, что строка, переданная в параметре
    // name, представлена в требуемом формате "фамилия, имя".
    public Employee4 {
        // Удалить любые ведущие и завершающие пробелы.
        name = name.trim();
        // Выполнить минимальную проверку того, что name
        // находится в формате "фамилия, имя".
        //Сначала удостовериться, что name содержит только одну запятую.
        int i = name.indexOf(','); // искать разделяющую запятую
        int j = name.lastIndexOf(',');
        if (i != j) try {
            throw
                    new IllegalAccessException("Обнаружено несколько запятых.");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        // Затем удостовериться, что до и псоле запятой имеется
        // хотя бы по одному символу.
        if (i < 1 | name.length() == i + 1) try {
            throw
                    new IllegalAccessException("Требуемый формат: фамилия, имя");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    // Метод экземпляра, который возвращает только фамилию, без имени.
    String lastName() {
        return name.substring(0, name.trim().indexOf(','));
    }
}

public class RecordDemo4 {
    public static void main(String[] args) {
        Employee4 emp = new Employee4("Jones, Robert", 1048);
        // Отобразить немодифицированный компонент name.
        System.out.println("Имя и фамилия сотрудника: " + emp.name());
        // Отобразить только фамилию.
        System.out.println("Фамилия сотрудника: " + emp.lastName());
    }
}
