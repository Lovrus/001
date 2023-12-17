package DomZad;
import java.util.List;

public class MainModel4 implements Model7 {

    //use helpful services
    private UserService4 userService = new UserServiceImpl4();

    //use special object to keep data for view rendering
    private ModelData8 modelData = new ModelData8();

    @Override
    public ModelData8 getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User9> users = userService.getUsersBetweenLevels(1, 100);
        //refresh model data
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(false);
    }

    @Override
    public void loadDeletedUsers() {
        List<User9> users = userService.getAllDeletedUsers();
        //refresh model data
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(true);
    }

    @Override
    public void loadUserById(long userId) {
        User9 user = userService.getUsersById(userId);
        modelData.setActiveUser(user);
    }
}