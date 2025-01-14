package Java_H_Schildt.chapter_2_27;
// Демонстрация использования BorderLayout.

import java.awt.*;
import java.awt.event.*;

public class BorderLayoutDemo extends Frame {
    public BorderLayoutDemo() {
        // В данном случае BorderLayout применяется по умолчанию.
        add(new Button("This is across the top."), BorderLayout.NORTH);
        // Это распологается вверху.
        add(new Label("The footer message might go here."), BorderLayout.SOUTH);
        // Здесь может находиться нижний колонтитул.
        add(new Button("Right"), BorderLayout.EAST);
        // Справа
        add(new Button("Left"), BorderLayout.WEST);
        // Слева
        String msg = " The reasonaЫe man adapts " +
                "himself to the world;\n" +
                "the unreasonable one persists iп " +
                "tryiпg to adapt the world to himself.\n" +
                "Therefore all progress depends " +
                " on the unreasonable man.\n\n" +
                "    - George Bernard Shaw\n\n";
// Рациональный человек приспосабливается к миру,
// безрассудный же упорно пытается приспособить мир к себе.
// Поэтому весь прогресс зависит от безрассудных людей.
//      - Джордж Бернард Шоу
        add(new TextArea(msg), BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        BorderLayoutDemo appwin = new BorderLayoutDemo();
        appwin.setSize(new Dimension(300, 220));
        appwin.setTitle("BorderLayoutDemo");
        appwin.setVisible(true);
    }
}
