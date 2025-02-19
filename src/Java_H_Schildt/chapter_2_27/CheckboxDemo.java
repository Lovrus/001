package Java_H_Schildt.chapter_2_27;
// Демонстрация использования флажков.

import java.awt.*;
import java.awt.event.*;

public class CheckboxDemo extends Frame implements ItemListener {
    String msg = "";
    Checkbox windows, android, linux, mac;

    public CheckboxDemo() {
        // Использовать поточную компоновку.
        setLayout(new FlowLayout());
        // Создать флажки.
        windows = new Checkbox("Windows", true);
        android = new Checkbox("Android");
        linux = new Checkbox("Linux");
        mac = new Checkbox("Mac OS");
        // Добавить флажки во фрейм.
        add(windows);
        add(android);
        add(linux);
        add(mac);
        // Добавить прослушиватели событий элементов.
        windows.addItemListener(this);
        android.addItemListener(this);
        linux.addItemListener(this);
        mac.addItemListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    // Отобразить текущее состояние флажков.
    public void paint(Graphics g) {
        msg = "Current state: ";
        // Текущее состояние
        g.drawString(msg, 20, 120);
        msg = " Windows: " + windows.getState();
        g.drawString(msg, 20, 140);
        msg = " Android: " + android.getState();
        g.drawString(msg, 20, 160);
        msg = " Linux: " + linux.getState();
        g.drawString(msg, 20, 180);
        msg = " Mac OS: " + mac.getState();
        g.drawString(msg, 20, 200);
    }

    public static void main(String[] args) {
        CheckboxDemo appwin = new CheckboxDemo();
        appwin.setSize(new Dimension(240, 220));
        appwin.setTitle("CheckboxDemo");
        appwin.setVisible(true);
    }
}
