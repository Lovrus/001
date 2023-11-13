package DomZad;
public class UsersView3 implements View4 {

    private Controller4 controller;

    @Override
    public void refresh(ModelData6 modelData) {
        System.out.println("All users:");
        for (User7 user : modelData.getUsers()) {
            System.out.println("\t" + user);
        }
        System.out.println("==================================================");
    }

    @Override
    public void setController(Controller4 controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }
}