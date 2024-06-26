package chapter_2_28;
// Загрузка и отображение изображения.

import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class SimpleimageLoad extends Frame {
    Image img;

    public SimpleimageLoad() {
        try {
            File imageFile = new File("Lilies.jpg");
            // Загрузить изображение.
            img = ImageIO.read(imageFile);
        } catch (IOException exc) {
            System.out.println("Не удалось загрузить файл изображения.");
            System.exit(0);
        }
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawImage(img, getInsets().left, getInsets().top, null);
    }

    public static void main(String[] args) {
        SimpleimageLoad appwin = new SimpleimageLoad();
        appwin.setSize(new Dimension(400, 365));
        appwin.setTitle("SimpleimageLoad");
        appwin.setVisible(true);
    }
}
