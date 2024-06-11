package chapter_2_27;
// Демонстрация использования текстовых полей.

import java.awt.*;
import java.awt.event.*;

public class TextFieldDemo extends Frame implements ActionListener {
    TextField name, pass;

    public TextFieldDemo() {
        // Использовать проточную компоновку.
        setLayout(new FlowLayout());
        // Создать элементы управления.
        Label namep = new Label("Name: ", Label.RIGHT); // Имя
        Label passp = new Label("Password: ", Label.RIGHT); // Пароль
        name = new TextField(12);
        pass = new TextField(8);
        pass.setEchoChar('?');
        // Добавить элементы управления во фрейм.
        add(namep);
        add(name);
        add(passp);
        add(pass);
        // Добавить прослушиватели событий действий.
        name.addActionListener(this);
        pass.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Пользователь нажал клавишу <Enter>.
    public void actionPerformed(ActionEvent ae) {
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Name: " + name.getText(), 20, 100); // Имя
        g.drawString("Selected text in name: " +
                name.getSelectedText(), 20, 120); // Текст
        // выбранный в имени
        g.drawString("Password: " + pass.getText(), 20, 140); // Пароль
    }

    public static void main(String[] args) {
        TextFieldDemo appwin = new TextFieldDemo();
        appwin.setSize(new Dimension(380, 180));
        appwin.setTitle("TextFieldDemo");
        appwin.setVisible(true);
    }
}
