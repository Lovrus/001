package DomZad;
import java.util.List;

public class MainModel3 implements Model {

    //use helpful services
    private UserService userService = new UserServiceImpl();

    //use special object to keep data for view rendering
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = userService.getUsersBetweenLevels(1, 100);
        //refresh model data
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(false);
    }

    @Override
    public void loadDeletedUsers() {
        List<User> users = userService.getAllDeletedUsers();
        //refresh model data
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(true);
    }
}