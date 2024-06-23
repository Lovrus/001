package chapter_2_27;
// Демонстрация использования диалогового окна.
import java.awt.*;
import java.awt.event.*;
public class DialogDemo extends Frame {
    String msg = "";
    CheckboxMenuItem debug, test;
    SampleDialog myDialog;
    public DialogDemo () {
        myDialog = new  SampleDialog(this, "New Dialog Box");
        // создать панель меню и добавить ее во фрейм.
        MenuBar mbar = new MenuBar();
                setMenuBar(mbar);
    }
}
