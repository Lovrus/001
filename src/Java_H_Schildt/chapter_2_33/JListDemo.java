package Java_H_Schildt.chapter_2_33;
// Демонстрация использования JList.

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class JListDemo {
    // Создать список городов.
    String[] cities = {"New York", "Chicago", "Houston", "Denver", "Los Angeles", "Seattle", "London", "Paris", "New Delhi", "Hong Kong", "Tokyo", "Sydney"};

    public JListDemo() {
// Настроить JFrame.
        JFrame jfrm = new JFrame("JListDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(200, 200);

        // Создать JList.
        JList<String> jlst = new JList<String>(cities);

        // Установить режим выбора списка в одиночный выбор.
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Добавить список в прокручиваемую панель.
        JScrollPane jscrlp = new JScrollPane(jlst);
// Установить предпоичитаемые размеры прокручиваемой панели.
        jscrlp.setPreferredSize(new Dimension(120, 90));
        // Создать метку, которая будет отображать выбор.
        JLabel jlab = new JLabel("Choose a City"); // Выберите город
// Добавить прослушиватель событий выбора для списка.
        jlst.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Получить индекс измененного элемента.
                int idx = jlst.getSelectedIndex();
// Если элемент был выбран, тогда отобразить выбор.
                if (idx != -1)
                    jlab.setText("Current selection: " + cities[idx]);
                    // Текущий выбор.
                else // В противном случае запросить выбор заново.
                    jlab.setText("Choose a City");
            }
        });
// Добавить список и метку в панель содержимого.
        jfrm.add(jscrlp);
        jfrm.add(jlab);
        // Отобразить фрейм.
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий.
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        new JListDemo();
                    }
                }
        );
    }
}
