package Java_H_Schildt.chapter_2_27;
// Демонстрация использования кнопок.

import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Frame implements ActionListener {
    String msq = "";
    Button yes, no, maybe;

    public ButtonDemo() {
        // Использовать поточную компоновку.
        setLayout(new FlowLayout());
        // Создать несколько кнопок.
        yes = new Button("Yes"); // Да
        no = new Button("No"); // Нет
        maybe = new Button("Undecided"); // В раздумьях
        // Добавить кнопки во фрейм.
        add(yes);
        add(no);
        add(maybe);
        // Добавить прослушиватели событий действий для кнопок.
        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Обработать события действий для кнопок.
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Yes")) {
            msq = "You pressed Yes.";
            // Щелчок на кнопке Yes
        } else if (str.equals("No")) {
            msq = "You pressed No.";
            // Щелчок на кнопке No
        } else {
            msq = "You pressed Undecided.";
            // Щелчко по кнопке Undecided
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msq, 20, 100);
    }

    public static void main(String[] args) {
        ButtonDemo appwin = new ButtonDemo();
        appwin.setSize(new Dimension(250, 150));
        appwin.setTitle("ButtonDemo");
        appwin.setVisible(true);
    }
}
