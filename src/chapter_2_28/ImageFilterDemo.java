package chapter_2_28;
// Демонстрация использования фильтров изображений.
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
import java.lang.reflect.*;
public class ImageFilterDemo extends Frame implements ActionListener {
    Image img;
    PlugInFilter pif;
    Image fimg;
    Image curImg;
    LoaderImage lim;
    label lab;
    Button reset;
    // Имена фильтров.
    String[] filters = {"Grayscale", "Invert", "Contrast", "Blur", "Sharpen"};

}
