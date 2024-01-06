package DomZad;

public class EditUserView3 implements View7{

    private Controller7 controller;

    @Override
    public void refresh(ModelData9 modelData) {
        System.out.println("User to be edited:");
        System.out.println("\t" + modelData.getActiveUser());
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller7 controller) {
        this.controller = controller;
    }

    public void fireEventUserDeleted(long id) {
        controller.onUserDelete(id);
    }
}
