package Java_H_Schildt.chapter_2_34;
// Демонстрация простого главного меню.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuDemo implements ActionListener {
    JLabel jlab;

    MenuDemo() {
// Создать контейнер JFrame.
        JFrame jfrm = new JFrame("Menu Demo");

        // Установить диспетчер компоновки FlowLayout.
        jfrm.setLayout(new FlowLayout());

        // Назначить фрейму начальные размеры.
        jfrm.setSize(220, 200);

        // Прекращать работу при закрытии пользователем приложения.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать метку, в которой будет отображаться выбор меню.
        jlab = new JLabel();

        // Создать панель меню.
        JMenuBar jmb = new JMenuBar();

        // Создать меню File.
        JMenu jmFile = new JMenu("File");
        JMenuItem jmiOpen = new JMenuItem("Open");
        JMenuItem jmiClose = new JMenuItem("Close");
        JMenuItem jmiSave = new JMenuItem("Save");
        JMenuItem jmiExit = new JMenuItem("Exit");
        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        jmb.add(jmFile);

        // Создать меню Options.
        JMenu jmOptions = new JMenu("Options");

//Создать подменю Colors.
        JMenu jmColors = new JMenu("Colors");
        JMenuItem jmiRed = new JMenuItem("Red");
        JMenuItem jmiGreen = new JMenuItem("Green");
        JMenuItem jmiBlue = new JMenuItem("Blue");
        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);
        jmOptions.add(jmColors);

        // Создать подменю Priority.
        JMenu jmPriority = new JMenu("Priority");
        JMenuItem jmiHigh = new JMenuItem("High");
        JMenuItem jmiLow = new JMenuItem("Low");
        jmPriority.add(jmiHigh);
        jmPriority.add(jmiLow);
        jmOptions.add(jmPriority);

// Создать пункт меню Reset.
        JMenuItem jmiReset = new JMenuItem("Reset");
        jmOptions.addSeparator();
        jmOptions.add(jmiReset);

        // Добавить меню Options в панель меню.
        jmb.add(jmOptions);

// Создать меню Help.
        JMenu jmHelp = new JMenu("Help");
        JMenuItem jmiAbout = new JMenuItem("About");
        jmHelp.add(jmiAbout);
        jmb.add(jmHelp);

        // Добавить прослушиватели событий действий для пунктов меню.
        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);


    }
}
