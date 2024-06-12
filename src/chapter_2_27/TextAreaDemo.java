package chapter_2_27;
// Демонстрация использования TextArea.

import java.awt.*;
import java.awt.event.*;

public class TextAreaDemo extends Frame {
    public TextAreaDemo() {
        // Использовать поточную компоновку.
        setLayout(new FlowLayout());
        String val =
                " JDK 17 is the latest version of опе of the most\n" +
                        "widely-used computer languages for Internet programming . \n" +
                        "Building on а rich heri tage, Java has advanced both\n" +
                        "the art and science of computer language design. \n\n" +
                        "One of the reasons for Java's ongoing suссеss is its\n" +
                        "constant, steady rate of evolution. Java has never stood\n" +
                        "still. Instead, Java has consistently adapted to the\n" +
                        "rapidly changing l andscape of the networked world. \n" +
                        "Moreover, Java has often led the way, charting the\n" +
                        "course for others to follow.";
// JDK 17-- последняя версия комплекта разработчика для одного
// из наиболее широко используемых языков программирования
// в Интернете.
// Основываясь на богатом наследии, язык Java содействует развитию
//как искусства, так и науки проектирования компьютерных языков.
// Одной из причин постоянного успеха языка Java является его
// постоянная и устойчивая скорость эволюции.
// Язык Java никогда не стоял на месте, взамен последовательно
//адаптируясь к быстро меняющемуся ландшафту сетевого мира.
// Более того, язык Java часто шел впереди, намечая курс, которому
// должны были следовать другие языки.
        TextArea text = new TextArea(val, 10, 30);
        add(text);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        TextAreaDemo appwin = new TextAreaDemo();
        appwin.setSize(new Dimension(300, 220));
        appwin.setTitle("TextAreaDemo");
        appwin.setVisible(true);
    }
}
