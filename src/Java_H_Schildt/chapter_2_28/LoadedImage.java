package Java_H_Schildt.chapter_2_28;

import java.awt.*;

public class LoadedImage extends Canvas {
    Image img;

    public LoadedImage(Image i) {
        set(i);
    }

    void set(Image i) {
        img = i;
        repaint();
    }

    public void paint(Graphics g) {
        if (img == null) {
            g.drawString("no image", 10, 30); // изображение отсутствует
        } else {
            g.drawImage(img, 0, 0, this);
        }
    }

    public Dimension getPeferredSize() {
        return new Dimension(img.getWidth(this), img.getHeight(this));
    }

    public Dimension getMinimumSize() {
        return getPeferredSize();
    }
}
