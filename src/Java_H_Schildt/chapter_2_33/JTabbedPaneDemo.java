package Java_H_Schildt.chapter_2_33;
// Демонстрация использования JTabbedPane.

import javax.swing.*;
import java.awt.*;

public class JTabbedPaneDemo {
    public JTabbedPaneDemo() {
        //Настроить JFrame.
        JFrame jfrm = new JFrame("JTabbedPaneDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(400, 200);
// Создать панель с вкладками.
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Cities", new CitiesPanel());
        jtp.addTab("Colors", new ColorsPanel());
        jtp.addTab("Flavors", new FlavorsPanel());
        jfrm.add(jtp);
        // Отобразить фрейм.
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий.
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        new JTabbedPaneDemo();
                    }
                }
        );
    }
}

// Создать панели, которые будут добавлены в панель с вкладками.
class CitiesPanel extends JPanel {

}
