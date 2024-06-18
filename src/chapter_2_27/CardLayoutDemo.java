package chapter_2_27;
// Демонстрация использования CardLayout.

import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo extends Frame {
    Checkbox windows10, windows7, windows8, android, linux, mac;
    Panel osCards;
    CardLayout cardLO;
    Button win, other;

    public CardLayoutDemo() {
        // Использовать поточную компоновку для главного фрейма.
        setLayout(new FlowLayout());
        win = new Button("Windows");
        other = new Button("Other");
        add(win);
        add(other);
        // Обеспечить применение в панели osCards компоновки CardLayout.
        cardLO = new CardLayout();
        osCards = new Panel();
        osCards.setLayout(cardLO);
        windows7 = new Checkbox("Windows 7", true);
        windows8 = new Checkbox("Windows 8");
        windows10 = new Checkbox("Windows 10");
        android = new Checkbox("Android");
        linux = new Checkbox("Linux");
        mac = new Checkbox("Mac OS");
        // Доабвить в панель флажки для операционных систем семейства Windows.
        Panel winPan = new Panel();
        winPan.add(windows7);
        winPan.add(windows8);
        winPan.add(windows10);
        // Добавить в панель флажки для других операционных систем.
        Panel otherPan = new Panel();
        otherPan.add(android);
        otherPan.add(linux);
        otherPan.add(mac);
        // Добавить панели в панель колоды карт.
        osCards.add(winPan, "Windows");
        osCards.add(otherPan, "other");
        // Другие
        // Добавить карты в панель главного фрейма.
        add(osCards);
        // Использовать лямбда-выражение для обработки кнопочных событий.
        win.addActionListener((ae) -> cardLO.show(osCards, "Windows"));
        other.addActionListener((ae) -> cardLO.show(osCards, "Other"));
        // Зарегистрировать события нажатия кнопки мыши.
        addMouseListener(new MouseAdapter() {
            // Совершить проход по панелям.
            public void mousePressed(MouseEvent me) {
                cardLO.next(osCards);
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        CardLayoutDemo appwin = new CardLayoutDemo();
        appwin.setSize(new Dimension(300, 220));
        appwin.setTitle("CardLayoutDemo");
        appwin.setVisible(true);
    }
}
