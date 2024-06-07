package chapter_2_27;
// Демонстрация группы флажков.

import java.awt.*;
import java.awt.event.*;

public abstract class CВGroup extends Frame implements ItemListener {
    String msg = "";
    Checkbox windows, android, linux, mac;
    CheckboxGroup cbg;

    public CВGroup() {
        // Использовать поточную компоновку.
        setLayout(new FlowLayout());
        // Создать группу флажков.
        cbg = new CheckboxGroup();
        // Создать флажки и включить их в группу.
        windows = new Checkbox("Windows", cbg, true);
        android = new Checkbox("Android", cbg, false);
        linux = new Checkbox("Linux", cbg, false);
        mac = new Checkbox("Mac OS", cbg, false);
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

    public void itemStateXcanger(ItemEvent ie) {
        repaint();
    }

    // Отобразить текущее состояние флажков.
    public void paint(Graphics g) {
        msg = "Current selection: ";
        // Текущий выбор
        msg += cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg, 20, 120);
    }

    public static void main(String[] args) {
        CВGroup appwin = new CВGroup() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        };
        appwin.setSize(new Dimension(240, 180));
        appwin.setTitle("CВGroup");
        appwin.setVisible(true);
    }
}
