package DomZad;
import java.util.List;

public class MainModel6 implements Model9 {

    //use helpful services
    private UserService6 userService = new UserServiceImpl6();

    //use special object to keep data for view rendering
    private ModelData10 modelData = new ModelData10();

    @Override
    public ModelData10 getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User10> users = getAllUsers();
        //refresh model data
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(false);
    }

    @Override
    public void loadDeletedUsers() {
        List<User10> users = userService.getAllDeletedUsers();
        //refresh model data
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(true);
    }

    @Override
    public void loadUserById(long userId) {
        User10 user = userService.getUsersById(userId);
        modelData.setActiveUser(user);
    }

    @Override
    public void deleteUserById(long id) {
        userService.deleteUser(id);
        List<User10> users = getAllUsers();
        //refresh model data
        modelData.setUsers(users);
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        userService.createOrUpdateUser(name, id, level);
        List<User10> users = getAllUsers();
        //refresh model data
        modelData.setUsers(users);
    }

    private List<User10> getAllUsers() {
        //model should contain all business logic in the methods
        List<User10> allUsers = userService.getUsersBetweenLevels(1, 100);
        allUsers = userService.filterOnlyActiveUsers(allUsers);
        return allUsers;
    }
}