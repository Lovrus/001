package DomZad;
public class JR_31_14_7 {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

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