package Java_H_Schildt.chapter_2_28;
// Фильтр свертки.

import DomZad.ImageReader;

import java.awt.*;
import java.awt.image.*;

abstract class Convolver implements ImageConsumer, PlugInFilter {
    int width, height;
    int[] imgpixels, newimgpixels;
    boolean imageReady = false;

    abstract void convolve(); // Здесь находится фильтр...

    public Image filter(Frame f, Image in) {
        boolean ImageReady = false;
        in.getSource().startProduction(this);
        waitForImage();
        newimgpixels = new int[width * height];
        try {
            convolve();
        } catch (Exception e) {
            System.out.println("Отказ Convolver: " + e);
            e.printStackTrace();
        }
        return f.createImage(
                new MemoryImageSource(width, height, newimgpixels, 0, width));
    }

    synchronized void waitForImage() {
        try {
            while (!imageReady)
                wait();
            ;
        } catch (Exception e) {
            System.out.println("Interrupted"); // Прервано
        }
    }

    public void setProperties(java.util.Hashtable<?, ?> dummy) {
    }

    public void setColorModel(ColorModel dummy) {
    }

    public void setHints(int dummy) {
    }

    public synchronized void imageComlete(int dummy) {
        imageReady = true;
        notifyAll();
    }

    public void setDimensions(int x, int y) {
        width = x;
        height = y;
        imgpixels = new int[x * y];
    }

    public void setPixels(int x1, int y1, int w, int h,
                          ColorModel model, byte[] pixels, int off, int scansize) {
        int pix, x, y, x2, y2, sx, sy;
        x2 = x1 + w;
        y2 = y1 + h;
        sy = off;
        for (y = y1; y < y2; y++) {
            sx = sy;
            for (x = x1; x < x2; x++) {
                pix = model.getRGB(pixels[sx++]);
                if ((pix & 0xff000000) == 0)
                    pix = 0x00ffffff;
                imgpixels[y * width + x] = pix;
            }
            sy += scansize;
        }
    }

    public void setPixels(int x1, int y1, int w, int h,
                          ColorModel model, int[] pixels, int off, int scansize) {
        int pix, x, y, x2, y2, sx, sy;
        x2 = x1 + w;
        y2 = y1 + h;
        sy = off;
        for (y = y1; y < y2; y++) {
            sx = sy;
            for (x = x1; x < x2; x++) {
                pix = model.getRGB(pixels[sx++]);
                if ((pix & 0xff000000) == 0)
                    pix = 0x00ffffff;
                imgpixels[y * width + x] = pix;
            }
            sy += scansize;
        }
    }
}
