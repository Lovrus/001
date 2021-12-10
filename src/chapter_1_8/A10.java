package chapter_1_8;

// Предотвращение переопределения с помощью ключевого слова final
public class A10 {
    final void meth() {
        System.out.println("Это конечный метод.");
    }
}

class B10 extends A10 {
    // void meth() {
    // ОШИБКА! Этот метод не может бть переопределен.
    //System.out.println("Недопустимо!");
}
