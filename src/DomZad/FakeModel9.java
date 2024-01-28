package DomZad;

import java.util.ArrayList;
import java.util.List;

public class FakeModel9 implements Model9 {

    private ModelData10 modelData = new ModelData10();

    @Override
    public ModelData10 getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User10> users = new ArrayList<>();
        users.add(new User10("A", 1l, 1));
        users.add(new User10("B", 2l, 1));
        modelData.setUsers(users);
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }
}
