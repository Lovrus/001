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
        // Всегда первым вызывать метод суперкласса.
        super.paintComponent(g);
        int x, y, x2, y2;
// Получить высоту и ширину компонента.
        int height = getHeight();
        int width = getWidth();
// Получить размеры границы.
        ins = getInsets();
        // Нарисовать десять линий со случайным образом
        // сгенерированными конечными точками.
        for (int i = 0; i < 10; i++) {
// Получить случайные координаты, определяющие
            // конечные точки каждой линии.
            x = rand.nextInt(width - ins.left);
            y = rand.nextInt(height - ins.bottom);
            x2 = rand.nextInt(width - ins.left);
            y2 = rand.nextInt(height - ins.bottom);
            // Нарисовать линию.
            g.drawLine(x, y, x2, y2);
        }
    }
}

// Демонстрация рисования напрямую внутри панели.
class PaintDemo {
    JLabel jlab;
    PaintPanel pp;

    PaintDemo() {
// Создать контейнер JFrame.
        JFrame jfrm = new JFrame("Paint Demo");
        //Демонстрация рисования
        // Установить начальные размеры фрейма.
        jfrm.setSize(200, 150);
        // Закончить работу, когда пользователь закрывает приложение.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Создать панель для рисования.
        pp = new PaintPanel();
// Добавить созданную панель в панель содержимого. Из-за использования
        // стандартной граничной компоновки панель будет автоматически
// подгоняться, чтобы уместиться в центральной области.

    }
}
