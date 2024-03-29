package DomZad;
import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/*
Перехват выборочных исключений
*/

public class JR_15_8_5 {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            handleExceptions();
        } catch (FileSystemException e) {
            BEAN.log(e);
        }
    }

    public static void handleExceptions() throws FileSystemException {
        try {
            BEAN.methodThrowExceptions();
        } catch (FileSystemException exception) {
            BEAN.log(exception);
            throw exception;
        } catch (IOException exception) {
            BEAN.log(exception);
        }
    }

    public static class StatelessBean {

        public int i = (int) (Math.random() * 3);

        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws IOException {
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}
