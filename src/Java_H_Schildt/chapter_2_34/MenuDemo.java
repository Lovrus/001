package Java_H_Schildt.chapter_2_34;
// Демонстрация простого главного меню.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuDemo implements ActionListener {
    JLabel jlab;

    MenuDemo() {
// Создать контейнер JFrame.
        JFrame jfrm = new JFrame("Menu Demo");

        // Установить диспетчер компоновки FlowLayout.
        jfrm.setLayout(new FlowLayout());

        // Назначить фрейму начальные размеры.
        jfrm.setSize(220, 200);

        // Прекращать работу при закрытии пользователем приложения.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
