package DomZad;

public class JR_31_14_4 {
    public static void main(String[] args) {
        Model4 model = new MainModel();
        UsersView2 usersView = new UsersView2();
        Controller3 controller = new Controller3();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();
    }
}
