package DomZad;

public interface JustAnInterface {
    B B = new B();

    class B extends C {
        public B() {
            System.out.print("B");
        }
    }
}
