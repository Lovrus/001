package DomZad;
public class Controller8 {
    //controller cannot contain business logic, only operate with views

    private Model9 model;
    private UsersView7 usersView;
    private EditUserView4 editUserView;

    public void setModel(Model9 model) {
        this.model = model;
    }

    public void setUsersView(UsersView7 usersView) {
        this.usersView = usersView;
    }

    public void setEditUserView(EditUserView4 editUserView) {
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

    public void onUserChange(String name, long id, int level) {
        model.changeUserData(name, id, level);
        usersView.refresh(model.getModelData());
    }
}