package DomZad;
public class Controller5 {
    //controller cannot contain business logic, only operate with views

    private Model6 model;
    private UsersView4 usersView;
    private EditUserView editUserView;

    public void setModel(Model6 model) {
        this.model = model;
    }

    public void setUsersView(UsersView4 usersView) {
        this.usersView = usersView;
    }

    public void setEditUserView(EditUserView editUserView) {
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
}