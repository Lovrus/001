package chapter_2_28;
// Демонстрация использования PixelGraber.
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class HistoGrab extends Frame {
    Dimension d;
    Image img;
    int iw, ih;
    int[] pixels;
    int[] hist = new int[256];
    int max_hist = 0;
    Insets ins;
    public HistoGrab () {
try {
    File imageFile = new File("Lilies.jpg");
    // Загрузить изображение.
    img = ImageIO.read(imageFile);
    iw = img.getWidth(null);
    ih = img.getHeight(null);
    pixels = new int[iw*ih];
    PixelGrabber pg = new PixelGrabber(img, 0,0, iw, ih,
            pixels, 0,iw);
    pg.grabPixels();
} catch (InterruptedException e) {
    System.out.println("Interrupted");
    return;
} catch (IOException exc) {
    System.out.println("Не удалось загрузить файл изображения.");
    System.exit(0);
}

    }
}
