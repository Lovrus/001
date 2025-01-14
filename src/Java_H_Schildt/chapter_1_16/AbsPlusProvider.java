package Java_H_Schildt.chapter_1_16;
// Поставщик для функции AbsPlus.
public class AbsPlusProvider implements BinFuncsProvider {
    // Предоставить объект AbsPlus.
    public BinaryFunc get() {return new AbsPlus();}
}
