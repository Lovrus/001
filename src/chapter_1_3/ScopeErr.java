package chapter_1_3;

public class ScopeErr {
    public static void main(String[] args) {
        // int bar = 1;
        { // создается новая область действия
            //int bar = 2;  // Обишка во время комплияции -
            // переменная bar уже определена!
        }
    }
}
