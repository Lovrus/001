package DomZad;

import java.io.*;

/*
Сериализация под запретом
*/

public class JR_27_10_6 implements Serializable {
    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream out) throws IOException {
            throw new NotSerializableException("Не сегодня!");
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            throw new NotSerializableException("Не сегодня!");
        }
    }

    public static void main(String[] args) {

    }
}
