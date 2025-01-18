package Java_H_Schildt.chapter_2_32;
// Обработка события в программе Swing.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventDemo {
    JLabel jlab;

    EventDemo() {
        // Создать контейнер JFrame.
        JFrame jfrm = new JFrame("An Event Example");
// Пример обработки события
        // Задать диспетчер компоновки FlowLayout.
        jfrm.setLayout(new FlowLayout());
        // Установить начальные размеры фрейма.
        jfrm.setSize(220, 90);
// Закончить работу, когда пользователь закрывает приложение.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Создать две кнопки.
        JButton jbtnAlpha = new JButton("Alpha");
        JButton jbtnBeta = new JButton("Beta");
// Добавить прослушиватель событий действий для кнопки Alpha.
        jbtnAlpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Alpha was pressed.");
                // Нажата кнопка Alpha
            }
        });
        // Добавить прослушиватель событий действий для кнопки Beta.
        jbtnBeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Beta was pressed.");
                // Нажата кнопка Beta
            }
        });
// Добавить кнопки в панель содержимого.
        jfrm.add(jbtnAlpha);
        jfrm.add(jbtnBeta);
        // Создать текстовую метку.
        jlab = new JLabel("Press a button."); // Нажмите кнопку
        // Добавить метку в панель содержимого.
        jfrm.add(jlab);
        // Отобразить фрейм.
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventDemo();
            }
        });
    }
}
