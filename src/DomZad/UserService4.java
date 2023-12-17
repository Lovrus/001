package DomZad;

import java.util.List;

public interface UserService4 {
    User9 deleteUser(long id);

    User9 createOrUpdateUser(String name, long id, int level);

    List<User9> getUsersByName(String name);

    List<User9> getAllDeletedUsers();

    List<User9> getUsersBetweenLevels(int fromLevel, int toLevel);

    List<User9> filterOnlyActiveUsers(List<User9> allUsers);

    User9 getUsersById(long userId);
}
