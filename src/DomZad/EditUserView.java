package DomZad;
public class EditUserView implements View5 {

    private Controller5 controller;

    @Override
    public void refresh(ModelData7 modelData) {
        System.out.println("User to be edited:");
        System.out.println("\t" + modelData.getActiveUser());
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller5 controller) {
        this.controller = controller;
    }
}