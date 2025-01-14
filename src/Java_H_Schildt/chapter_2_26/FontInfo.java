package Java_H_Schildt.chapter_2_26;
// Отображение информации о шрифте.

import java.awt.event.*;
import java.awt.*;

public class FontInfo extends Frame {
    public FontInfo() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        Font f = g.getFont();
        String fontName = f.getName();
        String fongFamily = f.getFamily();
        int fontSize = f.getSize();
        int fontStyle = f.getStyle();
        String msg = "Family:" + fontName;
        // Семейство
        msg += ", Font: " + fongFamily;
        // Шрифт
        msg += ", Size: " + fontSize + ", Style: ";
        // Размер
        if ((fontStyle & Font.BOLD) == Font.BOLD)
            msg += "Bold ";
        // Полужирное
        if ((fontStyle & Font.ITALIC) == Font.ITALIC)
            msg += "Italic ";
        // Курсивное
        if ((fontStyle & Font.PLAIN) == Font.PLAIN)
            msg += "Plain ";
        // Обычное
        g.drawString(msg, 10, 60);
    }

    public static void main(String[] args) {
        FontInfo appwin = new FontInfo();
        appwin.setSize(new Dimension(300, 100));
        appwin.setTitle("FontInfo");
        appwin.setVisible(true);
    }
}
