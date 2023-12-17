package DomZad;
public class JR_31_14_7 {
    public static void main(String[] args) {
        Model7 model = new MainModel4();
        UsersView5 usersView = new UsersView5();
        EditUserView2 editUserView = new EditUserView2();
        Controller6 controller = new Controller6();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        //emulate user events
        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        usersView.fireEventShowDeletedUsers();
    }
}