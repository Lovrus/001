package DomZad;

public class JR_31_14_9 {
    public static void main(String[] args) {
        Model9 model = new MainModel6();
        UsersView7 usersView = new UsersView7();
        EditUserView4 editUserView = new EditUserView4();
        Controller8 controller = new Controller8();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        //emulate user events
        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        editUserView.fireEventUserChanged("NewName", 126L, 73);
        usersView.fireEventShowDeletedUsers();
    }
}
