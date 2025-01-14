package Java_H_Schildt.chapter_2_25;
// В этой программе внутренний класс не используется.

import java.awt.*;
import java.awt.event.*;

public class MousePressedDemo extends Frame {
    String msg = "";

    public MousePressedDemo() {
        addMouseListener(new MyMouseAdapter4(this));
        addWindowListener(new MyWindowAdapter4());
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
    }

    public static void main(String[] args) {
        MousePressedDemo appwin = new MousePressedDemo();
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("MousePressedDemo");
        appwin.setVisible(true);
    }
}

class MyMouseAdapter4 extends MouseAdapter {
    MousePressedDemo mousePressedDemo;

    public MyMouseAdapter4(MousePressedDemo mousePressedDemo) {
        this.mousePressedDemo = mousePressedDemo;
    }

    // Обработать нажатие кнопки мыши.
    public void mousePressed(MouseEvent me) {
        mousePressedDemo.msg = "Mouse pressed";
        // Кнопка мыши нажата
        mousePressedDemo.repaint();
    }
}

// При щелчке на кнопке закрытия закрыть окно и завершить программу.
class MyWindowAdapter4 extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
