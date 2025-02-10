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

    }
}
