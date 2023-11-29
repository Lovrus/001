package DomZad;

public class JR_31_14_6 {
    public static void main(String[] args) {
        Model6 model = new MainModel3();
        UsersView4 usersView = new UsersView4();
        Controller5 controller = new Controller5();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventShowDeletedUsers();
    }
}
