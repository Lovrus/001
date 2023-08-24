package DomZad;

public abstract class FirstClass implements Action {     //first implementation

    protected FirstClass() {
        JR_31_4_2.countActionObjects++;
    }

    public void someAction() {
        System.out.println("class FirstClass, method someAction");
    }

    public abstract Action getDependantAction();
}
