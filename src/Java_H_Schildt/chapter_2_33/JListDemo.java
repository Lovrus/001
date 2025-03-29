package Java_H_Schildt.chapter_2_33;
// Демонстрация использования JList.

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class JListDemo {
    // Создать список городов.
    String[] cities = {"New York", "Chicago", "Houston",
            "Denver", "Los Angeles", "Seattle",
            "London", "Paris", "New Delhi",
            "Hong Kong", "Tokyo", "Sydney"};

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

    }
}
