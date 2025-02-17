package Java_H_Schildt.chapter_2_33;
// Демонстрация использования кнопки JButton на основе значка.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonDemo implements ActionListener {
    JLabel jlab;

    public JButtonDemo() {
        // Настроить JFrame.
        JFrame jfrm = new JFrame("JButtonDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(500, 450);
// Добавить кнопки в панель содержимого.
        ImageIcon hourglass = new ImageIcon("hourglass.png");
        JButton jb = new JButton(hourglass);
        jb.setActionCommand("Hourglass");// песочные часы
        jb.addActionListener(this);
        jfrm.add(jb);
        ImageIcon analog = new ImageIcon("analog.png");
        jb = new JButton(analog);
        jb.setActionCommand("Analog Clock"); // стрелочные часы
        jb.addActionListener(this);
        jfrm.add(jb);

    }
}

