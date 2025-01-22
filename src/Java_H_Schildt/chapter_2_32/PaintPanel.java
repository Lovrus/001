package Java_H_Schildt.chapter_2_32;
// Рисование линий внутри панели.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// Этот класс расширяет JPanel. В нем переопределяется метод
// paintComponent(), чтобы рисовать линии на поверхности панели.
public class PaintPanel extends JPanel {
    Insets ins; // Хранить размеры границы панели
    Random rand; // Используется для генерации случайных чисел

    // Создать панель.
    PaintPanel() {
        // Разместить рамку вокруг панели.
        setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        rand = new Random();
    }

    // Переопределить метод paintComponent().
    protected void paintComponent(Graphics g) {
        // Всегда первым вызывать метод суперклассав.

    }
}
