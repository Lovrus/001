package DomZad;

public class Controller {
    //controller cannot contain business logic, only operate with views

    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    public void onShowAllUsers() {
        model.loadUsers();
    }
}
