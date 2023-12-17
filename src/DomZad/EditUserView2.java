package DomZad;

public class EditUserView2 implements View6 {
    private Controller6 controller;

    @Override
    public void refresh(ModelData8 modelData) {
        System.out.println("User to be edited:");
        System.out.println("\t" + modelData.getActiveUser());
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller6 controller) {
        this.controller = controller;
    }
}
