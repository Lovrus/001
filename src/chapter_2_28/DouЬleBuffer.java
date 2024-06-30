package chapter_2_28;
// Демонстрация использования внеэкранного буфера.

import java.awt.*;
import java.awt.event.*;

public class DouЬleBuffer extends Frame {
    int gap = 3;
    int mx, my;
    boolean flicker = true;
    Image buffer = null;
    int w = 400, h = 400;

    public DouЬleBuffer() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragger(MouseEvent me) {
                mx = me.getX();
                my = me.getY();
                flicker = false;
                repaint();
            }

            public void mouseMoved(MouseEvent me) {
                mx = me.getX();
                my = me.getY();
                flicker = true;
                repaint();
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowsClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        Graphics screengc = null;
        if (!flicker) {
            screengc = g;
            g = buffer.getGraphics();
        }
        g.setColor(Color.blue);
        g.fillRect(0, 0, w, h);
        g.setColor(Color.red);
        for (int i = 0; i < w; i += gap)
            g.drawLine(i, 0, w - i, h);
        for (int i = 0; i < h; i += gap)
            g.drawLine(0, i, w, h - i);
        g.setColor(Color.black);
        g.drawString("Press mouse button to double buffer", 10, h / 2);
// Нажмите кнопу мыши, чтобы удвоить буфер
        g.setColor(Color.yellow);
        g.fillOval(mx - gap, my - gap, gap * 2 + 1, gap * 2 + 1);
        if (!flicker) {
            screengc.drawImage(buffer, 0, 0, null);
        }
    }

    public void update(Graphics g) {
        paint(g);
    }

    public static void main(String[] args) {
        DouЬleBuffer appwin = new DouЬleBuffer();
        appwin.setSize(new Dimension(400, 400));
        appwin.setTitle("DouЬleBuffer");
        appwin.setVisible(true);
        // Создать внеэкранный буфер.
        appwin.buffer = appwin.createImage(appwin.w, appwin.h);
    }
}
