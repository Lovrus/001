package chapter_1_16;
// Этот интерфейс определяет форму поставщика служб,
// который получает экземпляры BinaryFunc.

public interface BinFuncsProvider {
    // Получить экземпляр BinaryFunc.
    public BinaryFunc get();
}