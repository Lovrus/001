package DomZad;

public class UsersView {
    private Controller2 controller;

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("All users:");
        for (User user : modelData.getUsers()) {
            System.out.println("\t" + user);
        }
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }
}
