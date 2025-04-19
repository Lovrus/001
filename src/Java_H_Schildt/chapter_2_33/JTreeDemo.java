package Java_H_Schildt.chapter_2_33;
// Демонстрация использования JTree.

import java.awt.;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTreeDemo {
    public JTreeDemo() {
        // Настроить JFrame. Использовать стандартную компоновку BorderLayout.
        JFrame jfrm = new JFrame("JTreeDemo");
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(200, 250);
// Создать верхний узел дерева.
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");

        // Создать поддерево "А".
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a2);

        // Создать поддерево "B".
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        a.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        a.add(b2);

        // Создать дерево.
        JTree tree = new JTree(top);

        // Добавить дерево панель прокрутки.
        JScrollPane jsp = new JScrollPane(tree);

        // Добавить панель прокрутки в панель содержимого.
        jfrm.add(jsp);

        // Добавить метку в панель содержимого.
        JLabel jlab = new JLabel();
        jfrm.add(jlab, BorderLayout.SOUTH);

        // Обработать события выбора в дереве.
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                jlab.setText("Selection is " + e.getPath());
            }
        });

    }

}
