package chapter_2_25;
// Демонстрация обработчиков событий клавиатуры.

import java.awt.*;
import java.awt.event.*;

public class SimpleKey extends Frame implements KeyListener {
    String msg = "";
    String keyState = "";

    public SimpleKey() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter2());
    }

    // Обработать нажатие клавиши.
    public void keyPressed(KeyEvent ke) {
        keyState = "Key Down"; // Клавиша нажата
        repaint();
    }

    // Обработать отпускание клавиши.
    public void keyReleased(KeyEvent ke) {
        keyState = "Key Up"; // Клавиша отпущена
        repaint();
    }

    // Обработать ввод символа.
    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }

    // Отобразить результаты нажатых клавиш.
    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
        g.drawString(keyState, 20, 50);
    }

    public static void main(String[] args) {
        SimpleKey appwin = new SimpleKey();

        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("SimpleKey");
        appwin.setVisible(true);
    }
}

// При щелчке на кнопке закрытия закрыть окно и завершить программу.
class MyWindowAdapter2 extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
