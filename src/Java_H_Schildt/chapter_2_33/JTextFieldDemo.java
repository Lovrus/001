package Java_H_Schildt.chapter_2_33;
// Демонстрация использования JTextField.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldDemo {
    public JTextFieldDemo() {
// Настроить JFrame.
        JFrame jfrm = new JFrame("JTextFieldDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(260, 120);
// Добавить текстовое поле в панель содержимого.
        JTextField jtf = new JTextField(15);
        jfrm.add(jtf);
// Добавить метку.
        JLabel jlab = new JLabel();
        jfrm.add(jlab);
// Обработать события действий.
        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Отобразить текст, когда пользователь нажимает ENTER.
                jlab.setText(jtf.getText());
            }
        });
        // Отобразить фрейм.
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий.
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        new JTextFieldDemo();
                    }
                }
        );
    }
}
