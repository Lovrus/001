package Java_H_Schildt.chapter_2_33;
// Демонстрация использования JLabel.

import java.awt.*;
import javax.swing.*;

public class JLabelDemo {
    public JLabelDemo() {
// Настроить JFrame.
        JFrame jfrm = new JFrame("JlabelDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(260, 210);
        // Создать значок.
        ImageIcon ii = new ImageIcon("hourglass.png");
// Создать метку.
        JLabel jl = new JLabel("Hourglass", ii, JLabel.CENTER);
        // Добавить метку в панель содержимого.
        jfrm.add(jl);
// Отобразить фрейм.
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий.
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        new JLabelDemo();
                    }
                }
        );
    }
}
