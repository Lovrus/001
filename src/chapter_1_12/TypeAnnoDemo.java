package chapter_1_12;
// Продемонстрировать применение нескольких
// типовых аннотаций

import java.lang.annotation.*;
import java.lang.reflect.*;

// Аннотация-маркер, которую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface TypeAnno {
}

// Еще одна аннотация-маркер, которую можно
// применить к типу данных
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {
}

public interface TypeAnnoDemo {
}
