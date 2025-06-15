package Java_H_Schildt.chapter_2_34;
// Демонстрация простого главного меню.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.InputEvent;

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
        // Создать меню File с мнемоническими символами и клавиатурными сочетаниями
        JMenu jmFile = new JMenu("File");
        jmFile.setMnemonic(KeyEvent.VK_F);
        JMenuItem jmiOpen = new JMenuItem("Open", KeyEvent.VK_0);
        jmiOpen.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiClose = new JMenuItem("Сlозе", KeyEvent.VK_C);
        jmiClose.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiSave = new JMenuItem("Save", KeyEvent.VK_S);
        jmiSave.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiExit = new JMenuItem("Exit", KeyEvent.VK_E);
        jmiExit.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));

        // Создать меню Options.
        JMenu jmOptions = new JMenu("Options");

//Создать подменю Colors.
        JMenu jmColors = new JMenu("Colors");

        // Использовать флажки для цветов. Они позволяют
        // пользователю выбирать более одного цвета.
        JCheckBoxMenuItem jmiRed = new JCheckBoxMenuItem("Red");
        JCheckBoxMenuItem jmiGreen = new JCheckBoxMenuItem("Green");
        JCheckBoxMenuItem jmiBlue = new JCheckBoxMenuItem("Blue");

        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);
        jmOptions.add(jmColors);

        // Создать подменю Priority.
        JMenu jmPriority = new JMenu("Priority");

        // Использовать переключатели для настройки приоритета. Они дают
        // возможность показывать в меню применяемый приоритет и также
        // гарантируют, что в любой момент времени может быть выбран один
        // и только один приоритет. Обратите внимание, что изначально
        // выбран переключатель High (Высокий).

        JRadioButtonMenuItem jmiHigh =
                new JRadioButtonMenuItem("High", true);
        JRadioButtonMenuItem jmiLow =
                new JRadioButtonMenuItem("Low");

        jmPriority.add(jmiHigh);
        jmPriority.add(jmiLow);
        jmOptions.add(jmPriority);

        // Создать группу кнопок для пунктов меню с переключателями.
        ButtonGroup bg = new ButtonGroup();
        bg.add(jmiHigh); bg.add(jmiLow);

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
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);
        jmiRed.addActionListener(this);
        jmiGreen.addActionListener(this);
        jmiBlue.addActionListener(this);
        jmiHigh.addActionListener(this);
        jmiLow.addActionListener(this);
        jmiReset.addActionListener(this);
        jmiAbout.addActionListener(this);

        // Добавить метку в панель содержимого.
        jfrm.add(jlab);

// Добавить панель мерю во фрейм.
        jfrm.setJMenuBar(jmb);

        // Отобразить фрейм.
        jfrm.setVisible(true);

    }

    // Отобразить события действий для пунктов меню.
    public void actionPerformed(ActionEvent ae) {
        // Получить команду действия из выбора меню.
        String comStr = ae.getActionCommand();

        // Если пользователь выбарал Exit, тогда завершить программу.
        if (comStr.equals("Exit")) System.exit(0);
        // Иначе отобразить выбор.
        jlab.setText(comStr + "Selected");
    }

    public static void main(String[] args) {
        // Создать фрейм  в потоке диспетчеризации событий.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuDemo();
            }
        });
    }
}
