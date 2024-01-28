package DomZad;

public class UsersView7 implements View8 {

    private Controller8 controller;

    @Override
    public void refresh(ModelData10 modelData) {
        System.out.println("All " + (modelData.isDisplayDeletedUserList() ? "deleted " : "") + "users:");
        for (User10 user : modelData.getUsers()) {
            System.out.println("\t" + user);
        }
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller8 controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }

    public void fireEventOpenUserEditForm(long id) {
        controller.onOpenUserEditForm(id);
    }
}
