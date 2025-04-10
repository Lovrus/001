package Java_H_Schildt.chapter_2_33;
// Демонстрация использования JComЬoBox.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComЬoBoxDemo {
    String[] timepieces = {"Hourglass", "Analog", "Digital", "Stopwatch"};

    public JComЬoBoxDemo() {
// Настроить JFrame.
        JFrame jfrm = new JFrame("JComЬoBoxDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(400, 250);
// Создать комбинированный список и дбавить его в панель содержимого.
        JComboBox<String> jcb = new JComboBox<String>(timepieces);
        jfrm.add(jcb);
        // Создать метку и добавить ее в панель содержимого.
        JLabel jlab = new JLabel(new ImageIcon("hourglass.png"));
        jfrm.add(jlab);
// Обработать события выбора.
        jcb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) jcb.getSelectedItem();
                jlab.setIcon(new ImageIcon(s + ".png"));
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
                        new JComЬoBoxDemo();
                    }
                }
        );
    }
}
