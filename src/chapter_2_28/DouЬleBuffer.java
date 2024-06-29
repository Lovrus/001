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
        addMouseListener(new MouseMotionAdapter() {
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
        g.getColor(Color.blue);
        g.fillRect(0,0,w,h);
        g.getColor(Color.red);
        for (int i = 0;i<w; i+= gap)
            g.drawLine(i, w-i, h);
        for (int i = 0; i<h; i+=gap);
        g.drawLine(0,i,w, h-i);

    }
}
