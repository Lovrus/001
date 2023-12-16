package DomZad;

public class UsersView2 implements View3{
    private Controller3 controller;

    @Override
    public void refresh(ModelData5 modelData) {
        System.out.println("All users:");
        for (User6 user : modelData.getUsers()) {
            System.out.println("\t" + user);
        }
        System.out.println("==================================================");
    }

    @Override
    public void setController(Controller3 controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }
}
