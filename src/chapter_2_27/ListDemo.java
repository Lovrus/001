package chapter_2_27;
// Демонстрация использования списков.

import java.awt.*;
import java.awt.event.*;

public class ListDemo extends Frame implements ActionListener {
    List os, browser;
    String msg = "";

    public ListDemo() {
        // Использовать поточную компоновку.
        setLayout(new FlowLayout());
        // Создать список с множественным выбором.
        os = new List(4, true);
        // Создать список с одиночным выбором.
        browser = new List(4);
        // Добавить элементы в список os.
        os.add("Windows");
        os.add("Android");
        os.add("Linux");
        os.add("Mac OS");
        // Добавить элементы в список browser.
        browser.add("Edge");
        browser.add("Firefox");
        browser.add("Chrome");
        // Установить начальный выбор.
        browser.select(1);
        os.select(0);
        // Добавить списки во фрейм.
        add(os);
        add(browser);
        // Добавить прослушиватели событий действий.
        os.addItemListener((ItemListener) this);
        browser.addItemListener((ItemListener) this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        repaint();
    }

    // Отобразить элементы, выбранные в текущий момент.
    public void paint(Graphics g) {
        int[] idx;
        msg = "Current OS:";
        // Текущая операционная система.
        idx = os.getSelectedIndexes();
        for (int i = 0; i < idx.length; i++)
            msg += os.getItem(Integer.parseInt(idx[i] + "   "));
        g.drawString(msg, 20, 120);
        msg = "Current Browser: ";
        // Текущий браузер.
        msg += browser.getSelectedItem();
        g.drawString(msg, 20, 140);
    }

    public static void main(String[] args) {
        ListDemo appwin = new ListDemo();
        appwin.setSize(new Dimension(300, 180));
        appwin.setTitle("ListDemo");
        appwin.setVisible(true);
    }
}
