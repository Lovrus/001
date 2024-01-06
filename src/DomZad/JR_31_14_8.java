package DomZad;

public class JR_31_14_8 {
    public static void main(String[] args) {
        Model8 model = new MainModel5();
        UsersView6 usersView = new UsersView6();
        EditUserView3 editUserView = new EditUserView3();
        Controller7 controller = new Controller7();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        //emulate user events
        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        usersView.fireEventShowDeletedUsers();
    }
}
