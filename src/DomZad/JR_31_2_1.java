package DomZad;
/*
Создание своего интерфейса-маркера
*/

public class JR_31_2_1 {
    public static void main(String[] args) throws UnsupportedInterfaceMarkerException {
        SelfInterfaceMarkerImpl obj = new SelfInterfaceMarkerImpl();
        Util.testClass(obj);
    }
}
