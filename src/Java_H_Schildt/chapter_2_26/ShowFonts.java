package Java_H_Schildt.chapter_2_26;
// Отображение шрифтов.

import java.awt.event.*;
import java.awt.*;

public class ShowFonts extends Frame {
    String msg = "First five fonts: ";
    // Первые пять шрифтов
    GraphicsEnvironment ge;

    public ShowFonts() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        // Получить графическую среду.
        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        //Получить список шрифтов.
        String[] fontList = ge.getAvailableFontFamilyNames();
        // Создать строку с именами первых пяти шрифтов.
        for (int i = 0; (i < 5) && (i < fontList.length); i++)
            msg += fontList[i] + " ";
    }

    // Отобразить шрифты.
    public void paint(Graphics g) {
        g.drawString(msg, 10, 60);
    }

    public static void main(String[] args) {
        ShowFonts appwin = new ShowFonts();
        appwin.setSize(new Dimension(500, 100));
        appwin.setTitle("ShowFonts");
        appwin.setVisible(true);
    }
}
