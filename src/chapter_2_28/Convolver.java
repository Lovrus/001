package chapter_2_28;
// Фильтр свертки.
import java.awt.*;
import java.awt.image.*;

public class Convolver implements ImageConsumer, PlugInFilter {
    int width, height;
    int[] imgpixels, newimgpixels;
    boolean imageReady = false;
    abstract void convolve; // Здесь находится фильтр...

}
