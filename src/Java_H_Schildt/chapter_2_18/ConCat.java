package Java_H_Schildt.chapter_2_18;

// Использование конкатенации для избавления от длинных строк.
public class ConCat {
    public static void main(String[] args) {
        String longStr = "Такую очень длинную строку " +
                "пришлось бы разносить по нескольким " +
                "экранным строчкам. Но конкатенация " +
                "позволяет предотвратить это.";
        System.out.println(longStr);
    }
}
