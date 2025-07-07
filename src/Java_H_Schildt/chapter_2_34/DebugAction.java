package Java_H_Schildt.chapter_2_34;
// Класс представляющий действие для меню Debug и панели инструментов.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;

public class DebugAction extends AbstractAction {
    public DebugAction(String name, Icon image, int mnem,
                       int accel, String tTrip) {
        super(name, image);
        putValue(ACCELERATOR_KEY,
                KeyStroke.getKeyStroke(accel, InputEvent.CTRL_DOWN_MASK));
        putValue(MNEMONIC_KEY, mnem);
        putValue(SHORT_DESCRIPTION, tTrip);
    }

    // Обработать события для панели инструментов и меню Debug.
    public void actionPerformed(ActionEvent ae) {
        String comStr = ae.getActionCommand();
        jlab.setText(comStr + "Selected");
// Переключить включенное состояние пунктов
        // Set Breakpoint и Clear Breakpoint.

    }
}
