package Java_H_Schildt.chapter_2_33;
// Демонстрация использования JToggleButton.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JToggleButtonDemo {
    public JToggleButtonDemo() {
        // Настроить JFrame.
        JFrame jfrm = new JFrame("JToggleButtonDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(200, 100);

// Создать метку.
        JLabel jLab = new JLabel("Button is off."); // Кнопка выключена.
        // Создать переключатель.
        JToggleButton jtbn = new JToggleButton("On/Off");
        // Добавить прослушиватель событий элементов для переключателя.

    }
}
