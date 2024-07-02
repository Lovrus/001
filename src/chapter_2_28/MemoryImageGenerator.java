package chapter_2_28;
//Создание изображения в памяти.
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
public class MemoryImageGenerator extends Frame {
    Image img;
    int w = 512;
    int h = 512;

public  MemoryImageGenerator() {
    img[] pixels = new  img[w*h];
    int i = 0;
    for (int y =0; y<h; y++) {
        for (int x = 0; x<w; x++) {
            int r = (x^y)&0xff;
            int g = (x*2^y*2)&0xff;
            int b = (x*4^y*4) &0xff;
            pixels[i++] = (255<<24) | (r<<16) | (g << 8) | b;


        }
    }
}
}
