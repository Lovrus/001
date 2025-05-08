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

    }
}
