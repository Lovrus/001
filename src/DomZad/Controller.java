package DomZad;

public class Controller {
    //controller cannot contain business logic, only operate with views

    private Model2 model;

    public void setModel(Model2 model) {
        this.model = model;
    }

    public void onShowAllUsers() {
        model.loadUsers();
    }
}
