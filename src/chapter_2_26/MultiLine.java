package chapter_2_26;
// Демонстрация многострочного вывода текста.

import java.awt.event.*;
import java.awt.*;

public class MultiLine extends Frame {
    int curX = 20, curY = 40; // Текущая позиция

    public MultiLine() {
        Font f = new Font("SansSerif", Font.PLAIN, 12);
        setFont(f);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        nextLine("This  is on line one.", g);
        nextLine("This  is on line two.", g);
        sameLine(" This  is on same line.", g);
        sameLine(" This, too.", g);
        nextLine("This is on line three.", g);
        curX = 20;
        curY = 40; // сбрасывать координаты при каждом перерисовывании
    }

    // Advance to next line.
    void nextLine(String s, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        curY += fm.getHeight(); // Перейти на следующую строку
        curX = 20;
        g.drawString(s, curX, curY);
        curX += fm.stringWidth(s); // перейти в конец строки
    }

    // Отобразить в той же строке.
    void sameLine(String s, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        g.drawString(s, curX, curY);
        curX += fm.stringWidth(s); // Перейти в конец строки
    }

    public static void main(String[] args) {
        MultiLine appwin = new MultiLine();
        appwin.setSize(new Dimension(300, 120));
        appwin.setTitle("MultiLine");
        appwin.setVisible(true);
    }
}
