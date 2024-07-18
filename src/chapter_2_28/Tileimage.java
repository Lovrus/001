package chapter_2_28;
// Демонстрация использования CropImageFilter.

import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class Tileimage extends Frame {
    Image img;
    Image[] cell = new Image[4 * 4];
    int iw, ih;
    int tw, th;

    public Tileimage() {
        try {
            File imageFile = new File("Lilies.jpg");
            // Загрузить изображение.
            img = ImageIO.read(imageFile);
            iw = img.getWidth(null);
            ih = img.getHeight(null);
            tw = iw / 4;
            th = ih / 4;
        }
    }
}
