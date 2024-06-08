package chapter_2_27;
// Демонстрация использования меню типа Choice.

import java.awt.*;
import java.awt.event.*;

public abstract class ChoiceDemo extends Frame implements ItemListener {
    Choice os, browser;
    String msg = "";

    public ChoiceDemo() {
        // Использование поточную компоновку.
        setLayout(new FlowLayout());
        // Создать списки выбора.
        os = new Choice();
        browser = new Choice();
        // Добавить элементы в список os.
        os.add("Windows");
        os.add("Android");
        os.add("Linux");
        os.add("Mac OS");
        // Добавить элементы в список browser.
        browser.add("Edge");
        browser.add("Firefox");
        browser.add("Chrome");
        // Добавить списки выбора во фрейм.
        add(os);
        add(browser);
        // Добавить прослушиватели событий элементов.
        os.addItemListener(this);
        browser.addItemListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void itemStateChanger(ItemEvent ie) {
        repaint();
    }

    // Отобразить элементы, выбранные в текущий момент.
    public void paint(Graphics g) {
        msg = "Current OS: ";
        // Текущая операционная система
        msg += os.getSelectedItem();
        g.drawString(msg, 20, 120);
        msg = "Current Browser: ";
        // Текущий браузер
        msg += browser.getSelectedItem();
        g.drawString(msg, 20, 140);
    }

    public static void main(String[] args) {
        ChoiceDemo appwin = new ChoiceDemo() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        };
        appwin.setSize(new Dimension(240, 180));
        appwin.setTitle("ChoiceDemo");
        appwin.setVisible(true);
    }
}
