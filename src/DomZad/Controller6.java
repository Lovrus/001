package DomZad;
public class Controller6 {
    //controller cannot contain business logic, only operate with views

    private Model7 model;
    private UsersView5 usersView;
    private EditUserView2 editUserView;

    public void setModel(Model7 model) {
        this.model = model;
    }

    public void setUsersView(UsersView5 usersView) {
        this.usersView = usersView;
    }

    public void setEditUserView(EditUserView2 editUserView) {
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
}