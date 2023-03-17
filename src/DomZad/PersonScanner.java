package DomZad;

import java.io.IOException;

public interface PersonScanner {
    Person5 read() throws IOException;

    void close() throws IOException;
}
