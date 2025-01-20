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

    }
}
