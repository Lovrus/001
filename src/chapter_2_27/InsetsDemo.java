package chapter_2_27;
// демонстрация применения BorderLayout со вставками.

import java.awt.*;
import java.awt.event.*;

public class InsetsDemo extends Frame {
    public InsetsDemo() {
        // В данном случае BorderLayout применяется по умолчанию.
        // Установить фоновый цвет, чтобы вставки было легко заметить.
        setLayout(new BorderLayout());
        add(new Button("This is across the top."), BorderLayout.NORTH);
        add(new Label("The footer message might go here."), BorderLayout.SOUTH);
        add(new Button("Right"), BorderLayout.EAST);
        add(new Button("Left"), BorderLayout.WEST);
        String msg = " The reasonaЫe man adapts " +
                "himself to the world;\n" +
                "the unreasonable one persists iп " +
                "tryiпg to adapt the world to himself.\n" +
                "Therefore all progress depends " +
                " on the unreasonable man.\n\n" +
                "    - George Bernard Shaw\n\n";
        add(new TextArea(msg), BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Переопределить метод getInsets(), чтобы давить значения вставок.
    public Insets getInsets() {
        return new Insets(40, 20, 10, 20);
    }

    public static void main(String[] args) {
        InsetsDemo appwin = new InsetsDemo();
        appwin.setSize(new Dimension(300, 220));
        appwin.setTitle("InsetsDemo");
        appwin.setVisible(true);
    }
}
