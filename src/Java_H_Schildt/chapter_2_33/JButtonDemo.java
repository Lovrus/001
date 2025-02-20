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
        ImageIcon digital = new ImageIcon("digital.png");
        jb = new JButton(digital);
        jb.setActionCommand("Digital Clock"); // цифровые часы
        jb.addActionListener(this);
        jfrm.add(jb);
        ImageIcon stopwattch = new ImageIcon("stopwatch.png");
        jb = new JButton(stopwattch);
        jb.setActionCommand("Stopwatch"); // секундомер
        jb.addActionListener(this);
        jfrm.add(jb);
        // Создать метку и добавить ее в панель содержимого.
        jlab = new JLabel("Choose a Timepiece");
        // Выбери часы
        jfrm.add(jlab);
        // Отобразить фрейм.
        jfrm.setVisible(true);
    }
    // Обработать события кнопок.

}
