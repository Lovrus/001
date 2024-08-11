package chapter_2_28;
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
    ImageReady = false;
    in.getSource().startProduction(this);
    waitForImage();
    newimgpixels = new int[width*height];
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
            wait();;
    } catch (Exception e) {
        System.out.println("Interrupted"); // Прервано
    }
}
public void setProperties(java.util.Hashtable<?,?> dummy) { }
    public void setColorModel(ColorModel dummy) { }
    public void setHints(int dummy) { }
    public synchronized void imageComlete(int dummy) {
    imageReady = true;
    notifyAll();
    }

}
