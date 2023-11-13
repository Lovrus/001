package DomZad;

public class JR_31_14_5 {
    public static void main(String[] args) {
        Model5 model = new MainModel2();
        UsersView3 usersView = new UsersView3();
        Controller4 controller = new Controller4();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventShowDeletedUsers();
    }
}
