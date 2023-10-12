package DomZad;

public class Controller2 {
    //controller cannot contain business logic, only operate with views

    private Model3 model;
    private UsersView usersView;

    public void setModel(Model3 model) {
        this.model = model;
    }

    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }

    public void onShowAllUsers() {
        model.loadUsers();
        usersView.refresh(model.getModelData());
    }
}
