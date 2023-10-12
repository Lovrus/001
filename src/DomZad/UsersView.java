package DomZad;

public class UsersView  implements View2 {
    private Controller2 controller;

    @Override
    public void refresh(ModelData4 modelData) {
        System.out.println("All users:");
        for (User5 user : modelData.getUsers()) {
            System.out.println("\t" + user);
        }
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller2 controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }
}
