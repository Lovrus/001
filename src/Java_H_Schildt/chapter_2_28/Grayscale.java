package Java_H_Schildt.chapter_2_28;
// Фильтр яркости.

import java.awt.*;
import java.awt.image.*;
import java.applet.*;


import java.awt.event.*;
import java.util.*;

public class Grayscale extends RGBImageFilter implements PlugInFilter {
    public Grayscale() {
    }

    public Image filter(Frame f, Image in) {
        return f.createImage(new FilteredImageSource(in.getSource(), this));
    }

    public int filterRGB(int x, int y, int rgb) {
        int r = (rgb >> 16) & 0xff;
        int g = (rgb >> 8) & 0xff;
        int b = rgb & 0xff;
        int k = (int) (.56 * g + .33 * r + .11 * b);
        return (0xff000000 | k << 16 | k << 8 | k);
    }
}
