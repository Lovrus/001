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
        jtbn.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (jtbn.isSelected())
                    jLab.setText("Button is on."); // Кнопка включена
                else
                    jLab.setText("Button is off."); //Кнопка выключена
            }
        });
        // Добавить переключатель и метку в панель содержимого.
        jfrm.add(jtbn);
        jfrm.add(jLab);
        //Отобразить фрейм.
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий.
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        new JToggleButtonDemo();
                    }
                }
        );
    }
}
