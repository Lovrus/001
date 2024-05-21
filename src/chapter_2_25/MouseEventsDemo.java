package chapter_2_25;
// Демонстрация обработчиков событий мыши.

import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {
    String msq = "";
    int mouseX = 0, mouseY = 0; // координаты указателя мыши

    public MouseEventsDemo() {
        addMouseListener(this);
        addMouseListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    // Обработать щелчок кнопкой мыши.
    public void mouseClicked(MouseEvent me) {
        msq = msq + "-- click received";
        repaint();
        // -- получен щелчок
    }

    // Обработать наведение на окно указателя мыши.
    public void mouseEntered(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        msq = "Mouse entered";
        // Указатель мыши наведен на окно
        repaint();
    }

    // Обработать покидание окна указателем мыши.
    public void mouseExited(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        msq = "Mouse exited";
        // Указатель мыши покинул окно
        repaint();
    }

    // Обработать нажатие кнопки мыши.
    public void mousePressed(MouseEvent me) {
        // Сохранить координаты.
        mouseX = me.getX();
        mouseY = me.getY();
        msq = "Button down";
        // Кнопка нажата
        repaint();
    }

    // Обработать отпускание кнопки мыши.
    public void mouseReleased(MouseEvent me) {
        // Сохранить координаты.
        mouseX = me.getX();
        mouseY = me.getY();
        msq = "Button Released";
        // Кнопка отпущена
        repaint();
    }

    // Обработать перетаскивание указателя мыши.
    public void mouseDragged(MouseEvent me) {
        // Сохранить координаты.
        mouseX = me.getX();
        mouseY = me.getY();
        msq = "*" + " mouse at " + mouseX + ", " + mouseY;
        // * курсор мыши находится в
        repaint();
    }

    // Обработать перемещение указателя мыши.
    public void mouseMoved(MouseEvent me) {
        msq = "Moving mouse at " + me.getX() + ", " + me.getY();
        // Перемещение курсора мыши в
        repaint();
    }

    // Отобразить сообщение в текущей позиции X, Y окна.
    public void paint(Graphics g) {
        g.drawString(msq, mouseX, mouseY);
    }

    public static void main(String[] args) {
        MouseEventsDemo appwin = new MouseEventsDemo();
        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("MouseEventDemo");
        appwin.setVisible(true);
    }
}

// При щелчке на кнопке закрытия закрыть окно и завершить программу.
class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
