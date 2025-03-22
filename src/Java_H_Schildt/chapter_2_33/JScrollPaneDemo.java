package Java_H_Schildt.chapter_2_33;
// Демонстрация использования области прокрутки.

import java.awt.*;
import javax.swing.*;

public class JScrollPaneDemo {
    public JScrollPaneDemo() {
// Настроить JFrame. Использовать стандартную компоновку BorderLayot.
        JFrame jfrm = new JFrame("JScrollPaneDemo");
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(400, 400);
// Создать панель и добавить к ней 400 кнопок.
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(20, 20));
        int b = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                jp.add(new JButton("Button " + b));
                ++b;
            }
        }
// Создать панель прокрутки.
        JScrollPane jsp = new JScrollPane(jp);
        // Добавить панель прокрутки в панель содержимого.
        // Из-за применения стандартной компоновки панель
        // прокрутки добавится в центральную область.

    }
}
