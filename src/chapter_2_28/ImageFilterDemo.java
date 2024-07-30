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

    public ImageFilterDemo() {
        Panel p = new Panel();
        add(p, BorderLayout.SOUTH);
        // Создать кнопку Reset(Сброс).
        reset = new Button("Reset");
        reset.addActionListener(this);
        p.add(reset);
// Добавить кнопки фильтров.
        for (String fstr : filters) {
            Button b = new Button(fstr);
            b.addActionListener(this);
            p.add(b);
        }
        // Создать верхнюю кнопку.
        lab = new Label("");
        add(lab, BorderLayout.NORTH);
        // Загрузить изображение.
        try {
            File imageFile = new File("Lilies.jpg");
            img = ImageIO.read(imageFile);
        } catch (IOException exc) {
            System.out.println("Не удалось загрузить файл изображения.");
            System.exit(0);
        }
        // Получить объект LoadedImage и расположить его по центру.
        lim = new LoadedImage(img);
        add(lim, BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
public void actionPerformed(ActionEvent ae) {
        String a = "";
        try {
            a = ae.getActionCommand();
            if (a.equals("Reset")) {
                lim.set(img);
                lab.setText("Normal"); // Нормальное
            }
        }
}
}
