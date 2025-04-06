package Java_H_Schildt.chapter_2_33;
// Демонстрация использования JComЬoBox.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComЬoBoxDemo {
    String[] timepieces = {"Hourglass", "Analog", "Digital", "Stopwatch"};

    public JComЬoBoxDemo() {
// Настроить JFrame.
        JFrame jfrm = new JFrame("JComЬoBoxDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(400, 250);

    }
}
