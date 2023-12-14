package DomZad;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Исправить ошибку. Сериализация
*/

public class JR_27_10_4 implements Serializable {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutput = new FileOutputStream("your.file.name");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);

        JR_27_10_4 solution = new JR_27_10_4 ();
        outputStream.writeObject(solution);

        fileOutput.close();
        outputStream.close();

        //load
        FileInputStream fiStream = new FileInputStream("your.file.name");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        JR_27_10_4 loadedObject = (JR_27_10_4) objectStream.readObject();

        fiStream.close();
        objectStream.close();

        //Attention!!
        System.out.println(loadedObject.size());
    }

    private Map<String, String> m = new HashMap<>();

    public Map<String, String> getMap() {
        return m;
    }

    public JR_27_10_4 () {
        m.put("Mickey", "Mouse");
        m.put("Mickey", "Mantle");
    }

    public int size() {
        return m.size();
    }
}
