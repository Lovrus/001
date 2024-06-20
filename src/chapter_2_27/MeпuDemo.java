package chapter_2_27;
// Демонстрация использования меню.

import java.awt.*;
import java.awt.event.*;
public class MeпuDemo extends Frame {
    String msg = "";
    CheckboxMenuItem debug, test;
    public MeпuDemo() {
        // Создать панель меню и добавить ее во фрейм.
        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);
        // Создать пункты меню.
        java.awt.Menu file = new java.awt.Menu("File"); // Файл
        MenuItem item1, item2, item3, item4, item5;
        file.add(item1 = new MenuItem("New...")); // Создать
        file.add(item2 = new MenuItem("Open...")); // Открыть
        file.add(item3 = new MenuItem("Clode...")); // закрыть
        file.add(item4 = new MenuItem("-"));
        file.add(item5 = new MenuItem("Quit...")); // Выйти
        mbar.add(file);

        java.awt.Menu edit = new Menu("Edit"); // Правка
        MenuItem item6, item7, item8, item9;
        edit.add(item6 = new MenuItem("Cut")); // Вырезать
        edit.add(item7 = new  MenuItem("Paste")); // Вставить.
        edit.add(item8 = new MenuItem("-"));

        Menu sub = new Menu("Special"); // Сервис
        MenuItem item10, item11, item12;
        sub.add(item10 = new MenuItem("First")); // Первый
        sub.add(item11 = new MenuItem("Second")); // Второй
        sub.add(item12 = new MenuItem("Third")); // Третий
        edit.add(sub);

        // Создать переключаемые пункты меню.
        debug = new CheckboxMenuItem("Debug"); // Отладка
        edit.add(debug);
        test = new CheckboxMenuItem("Testing"); // Тестирование
        edit.add(test);
        mbar.add(edit);

        // Создать объект для обработки событий действий и элементов.
        MyMenuHandler handler = new MyMenuHandler();
        // Зарегистри
    }
}
