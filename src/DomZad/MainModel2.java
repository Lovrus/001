package DomZad;
import java.util.List;

public class MainModel2 implements Model5 {

    //use helpful services
    private UserService2 userService = new UserServiceImpl2();

    //use special object to keep data for view rendering
    private ModelData6 modelData = new ModelData6();

    @Override
    public ModelData6 getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User7> users = userService.getUsersBetweenLevels(1, 100);
        //refresh model data
        modelData.setUsers(users);
    }

    @Override
    public void loadDeletedUsers() {
        List<User7> users = userService.getAllDeletedUsers();
        //refresh model data
        modelData.setUsers(users);
    }
}