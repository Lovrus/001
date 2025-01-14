package Java_H_Schildt.chapter_2_27;
// Демонстрация использования GridBagLayout.

import java.awt.*;
import java.awt.event.*;

public class GridBagDemo extends Frame implements ItemListener {
    String msg = "";
    Checkbox windows, android, linux, mac;

    public GridBagDemo() {
        // Использовать GridBagLayout
        GridBagLayout gbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbag);
        // Определить флажки.
        windows = new Checkbox("Windows", true);
        android = new Checkbox("Android");
        linux = new Checkbox("Linux");
        mac = new Checkbox("Mac OS");
        // Определить гибкую сеточную компоновку.
        // Использовать стандартный вес строки, равный 0, для первой строки .
        gbc.weightx = 1.0; // вес, колонки, равный 1
        gbc.ipadx = 200; // заполнение на 200 единиц
        gbc.insets = new Insets(0, 6, 0, 0); // вставка немного слева
        gbc.anchor = GridBagConstraints.NORTHEAST;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(windows, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbag.setConstraints(android, gbc);
        // Назначить второй строке вес, равный 1.
        gbc.weighty = 1.0;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(linux, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbag.setConstraints(mac, gbc);
        // Добавить компоненты.
        add(windows);
        add(android);
        add(linux);
        add(mac);
        // Зарегистрировать прослушиватели для получения событий элементов.
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

    // Перерисовывать в случае изменения состояния какого-то флажка.
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    // Отобразить текущее состояние флажков.
    public void paint(Graphics g) {
        msg = "Current state: ";
        // Текущее состояние
        g.drawString(msg, 20, 100);
        msg = " Windows: " + windows.getState();
        g.drawString(msg, 30, 120);
        msg = " Android: " + android.getState();
        g.drawString(msg, 30, 140);
        msg = " Linux: " + linux.getState();
        g.drawString(msg, 30, 160);
        msg = " Mac OS: " + mac.getState();
        g.drawString(msg, 30, 180);
    }

    public static void main(String[] args) {
        GridBagDemo appwin = new GridBagDemo();
        appwin.setSize(new Dimension(250, 200));
        appwin.setTitle("GridBagDemo");
        appwin.setVisible(true);
    }
}
