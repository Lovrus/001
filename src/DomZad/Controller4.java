package DomZad;
public class Controller4 {
    //controller cannot contain business logic, only operate with views

    private Model5 model;
    private UsersView3 usersView;

    public void setModel(Model5 model) {
        this.model = model;
    }

    public void setUsersView(UsersView3 usersView) {
        this.usersView = usersView;
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