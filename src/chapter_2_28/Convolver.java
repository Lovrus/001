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
}
}
