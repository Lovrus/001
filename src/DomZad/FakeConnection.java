package DomZad;

public class FakeConnection implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closing database connection...");
    }

    public FakeConnection() {
        System.out.println("Establishing database connection...");
    }

    public void unsupportedOperation() {
        System.out.println("Operation is not supported yet!");
        throw new RuntimeException("UnsupportedOperation!");
    }

    public void usefulOperation() {
        System.out.println("Executing useful operation.");
    }
}
