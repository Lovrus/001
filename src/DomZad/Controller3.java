package DomZad;

public class Controller3 {
    //controller cannot contain business logic, only operate with views

    private Model4 model;
    private UsersView2 usersView;

    public void setModel(Model4 model) {
        this.model = model;
    }

    public void setUsersView(UsersView2 usersView) {
        this.usersView = usersView;
    }

    public void onShowAllUsers() {
        model.loadUsers();
        usersView.refresh(model.getModelData());
    }
}

