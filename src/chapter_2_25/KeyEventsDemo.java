package chapter_2_25;
// Демонстрация нескольких кодов виртуальных клавиш.

import java.awt.*;
import java.awt.event.*;

public class KeyEventsDemo extends Frame implements KeyListener {
    String msg = "";
    String keyState = "";

    public KeyEventsDemo() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter3());
    }

    // Обработать нажатие клавиши.
    public void keyPressed(KeyEvent ke) {
        keyState = "Key Down"; // Клавиша нажата.
        int key = ke.getKeyCode();
        switch (key) {
            case KeyEvent.VK_1:
                msg += "<F1>";
                break;
            case KeyEvent.VK_2:
                msg += "<F2>";
                break;
            case KeyEvent.VK_3:
                msg += "<F3>";
                break;
            case KeyEvent.VK_PASTE_DOWN:
                msg += "<PgDn>";
                break;
            case KeyEvent.VK_LEFT:
                msg += "<Left Arrow>"; // Стрелка влево
                break;
            case KeyEvent.VK_RIGHT:
                msg += "<Right Arrow>"; // стрелка вправо
                break;
        }
        repaint();
    }

    // Обработать отпускание клавиши.
    public void keyReleased(KeyEvent ke) {
        keyState = "Key Up"; // Клавиша отпущена
        repaint();
    }

    // Обработать ввод символа.
    public void KeyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }

    // Отобразить результаты нажатых клавиш.
    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
        g.drawString(keyState, 20, 50);
    }

    public static void main(String[] args) {
        KeyEventsDemo appwin = new KeyEventsDemo();
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("KeyEventsDemo");
        appwin.setVisible(true);
    }
}

// При щелчке на кнопке закрытия закрыть окно и завершить программу.
class MyWindowAdapter3 extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
