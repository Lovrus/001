package DomZad;
import java.util.List;

public class MainModel3 implements Model6 {

    //use helpful services
    private UserService3 userService = new UserServiceImpl3();

    //use special object to keep data for view rendering
    private ModelData7 modelData = new ModelData7();

    @Override
    public ModelData7 getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User8> users = userService.getUsersBetweenLevels(1, 100);
        //refresh model data
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(false);
    }

    @Override
    public void loadDeletedUsers() {
        List<User8> users = userService.getAllDeletedUsers();
        //refresh model data
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(true);
    }
}