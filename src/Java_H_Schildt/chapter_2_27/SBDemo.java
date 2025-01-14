package Java_H_Schildt.chapter_2_27;
// Демонстрация использования полос прокрутки.

import java.awt.*;
import java.awt.event.*;

public abstract class SBDemo extends Frame implements AdjustmentListener {
    String msg = "";
    Scrollbar vertSB, horzSB;

    public SBDemo() {
        // Использовать поточную компоновку.
        setLayout(new FlowLayout());
        // Создать полосы прокрутки и установить предпочитаемые размеры.
        vertSB = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 200);
        vertSB.setPreferredSize(new Dimension(20, 100));
        horzSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
        horzSB.setPreferredSize(new Dimension(100, 20));
        // Добавить полосы прокрутки во фрейм.
        add(vertSB);
        add(horzSB);
        // Добавить прослушивателя событий корректировки для полос прокрутки.
        vertSB.addAdjustmentListener(this);
        horzSB.addAdjustmentListener(this);
        // Добавить прослушиватели событий движения мыши.
        addMouseMotionListener(new MouseAdapter() {
            // Обновить полосы прокрутки, чтобы отразить
            // перетаскивание указателя мыши.
            public void mouseDragged(MouseEvent me) {
                int x = me.getX();
                int y = me.getY();
                vertSB.setValue(y);
                horzSB.setValue(x);
                repaint();
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void abjustmentValueChanged(AdjustmentEvent ae) {
        repaint();
    }

    // Отобразить тккущие значения полос прокрутки.
    public void paint(Graphics g) {
        msg = "Vertical: " + horzSB.getValue();
        msg += ", Horizontal: " + horzSB.getValue();
        g.drawString(msg, 20, 160);
        // Отобразить тккущую позицию указателя мыши при перетаскивании.
        g.drawString("*", horzSB.getValue(),
                vertSB.getValue());
    }

    public static void main(String[] args) {
        SBDemo appwin = new SBDemo() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {

            }
        };
        appwin.setSize(new Dimension(300, 180));
        appwin.setTitle("SBDemo");
        appwin.setVisible(true);
    }
}
