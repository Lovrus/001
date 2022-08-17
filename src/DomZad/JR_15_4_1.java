package DomZad;

import java.io.FileNotFoundException;

public class JR_15_4_1 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException, ClassNotFoundException { //тут кинется исключение FileNotFoundException, такого файла нет FileInputStream fis = new FileInputStream("C2:\badFileName.txt"); }
    }
}

