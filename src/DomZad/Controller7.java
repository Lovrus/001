package DomZad;
public class Controller7 {
    //controller cannot contain business logic, only operate with views

    private Model8 model;
    private UsersView6 usersView;
    private EditUserView3 editUserView;

    public void setModel(Model8 model) {
        this.model = model;
    }

    public void setUsersView(UsersView6 usersView) {
        this.usersView = usersView;
    }

    public void setEditUserView(EditUserView3 editUserView) {
        this.editUserView = editUserView;
    }

    public void onShowAllUsers() {
        model.loadUsers();
        usersView.refresh(model.getModelData());
    }

    public void onShowAllDeletedUsers() {
        model.loadDeletedUsers();
        usersView.refresh(model.getModelData());
    }

    public void onOpenUserEditForm(long userId) {
        model.loadUserById(userId);
        editUserView.refresh(model.getModelData());
    }

    public void onUserDelete(long id) {
        model.deleteUserById(id);
        usersView.refresh(model.getModelData());
    }
}