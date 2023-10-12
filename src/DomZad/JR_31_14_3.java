package DomZad;

public class JR_31_14_3 {
    public static void main(String[] args) {
        Model3 model = new FakeModel3();
        UsersView usersView = new UsersView();
        Controller2 controller = new Controller2();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();
    }
}
