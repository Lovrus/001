package Java_H_Schildt.chapter_2_32;
// Обработка события в программе Swing.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventDemo {
    JLabel jlab;

    EventDemo() {
        // Создать контейнер JFrame.
        JFrame jfrm = new JFrame("An Event Example");
// Пример обработки события
        // Задать диспетчер компоновки FlowLayout.
        jfrm.setLayout(new FlowLayout());
        // Установить начальные размеры фрейма.
jfrm.setSize(220,90);
// Закончить работу, когда пользователь закрывает приложение.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Создать две кнопки.

    }
}
