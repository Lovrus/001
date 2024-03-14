package chapter_1_16;

// Поставщик для функции AbsMinus.
public class AbsMinusProvider implements BinFuncsProvider {
    // Предоставить объект AbsMinus.
    public BinaryFunc get() {
        return new AbsMinus();
    }
}
