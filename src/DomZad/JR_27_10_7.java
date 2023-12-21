package DomZad;

import java.io.*;

/*
Переопределение сериализации в потоке
*/

public class JR_27_10_7 implements Serializable, AutoCloseable {
    public static void main(String[] args) {
        try (FileOutputStream fileOutput = new FileOutputStream("your_file_name_2.txt");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
             FileInputStream fiStream = new FileInputStream("your_file_name_2.txt");
             ObjectInputStream objectStream = new ObjectInputStream(fiStream)
        ) {
            JR_27_10_7 solution = new JR_27_10_7("your_file_name_1.txt");
            solution.writeObject("some text");

            outputStream.writeObject(solution);
            outputStream.flush();

            //load object from file
            JR_27_10_7 loadedObject = (JR_27_10_7) objectStream.readObject();

            loadedObject.writeObject("some text - 2");
        } catch (Exception skipped) {
        }
    }

    private transient FileOutputStream stream;
    private String fileName;

    public JR_27_10_7(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }
}
