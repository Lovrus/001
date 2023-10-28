package DomZad;
import java.util.List;

public class MainModel implements Model4 {

    //use helpful services
    private UserService userService = new UserServiceImpl();

    //use special object to keep data for view rendering
    private ModelData5 modelData = new ModelData5();

    @Override
    public ModelData5 getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User6> users = userService.getUsersBetweenLevels(1, 100);
        //refresh model data
        modelData.setUsers(users);
    }
}