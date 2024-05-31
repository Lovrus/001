package chapter_2_26;
// Отображение шрифтов.

import java.awt.*;
import java.awt.event.*;

public class Samplefonts extends Frame {
    int next = 0;
    Font f;
    String msg;

    public Samplefonts() {
        f = new Font("Dialog", Font.PLAIN, 12);
        msg = "Dialog";
        setFont(f);
        addMouseListener(new MyMouseAdapter(this));
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(msg, 10, 60);
    }

    public static void main(String[] args) {
        Samplefonts appwin = new Samplefonts();
        appwin.setSize(new Dimension(200, 100));
        appwin.setTitle("Samplefonts");
        appwin.setVisible(true);
    }
}
class MyMouseAdapter extends MouseAdapter {
    Samplefonts samplefonts;
    public MyMouseAdapter(Samplefonts samplefonts) {
        this.samplefonts = samplefonts;
        }
        public MyMouseAdapter(Samplefonts samplefonts) {
        this.samplefonts = samplefonts;
        }
        public void mousePressed(MouseEvent me) {
        // Переключать шрифты при каждом щелчке кнопкой мыши.

        }
}