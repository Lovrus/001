package Java_H_Schildt.chapter_2_25;
// Демонстрация использования внутренних классов.

import java.awt.*;
import java.awt.event.*;

public class InnerClassDemo extends Frame {
    String msg = "";

    public InnerClassDemo() {
        addMouseListener(new MyMouseAdapter5());
        addWindowListener(new MyWindowAdapter5());
    }

    // Внутренний класс для обработки событий нажатия на кнопки мыши.
    class MyMouseAdapter5 extends MouseAdapter {
        public void mousePressed(MouseEvent me) {
            msg = "Mouse Pressed";
            // Кнопка мыши нажата.
            repaint();
        }
    }

    // Врутренний класс для обработки событий закрытия окна.
    class MyWindowAdapter5 extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 80);
    }

    public static void main(String[] args) {
        InnerClassDemo appwin = new InnerClassDemo();
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("InnerClassDemo");
        appwin.setVisible(true);
    }
}
