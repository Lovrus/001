package DomZad;
import java.util.ArrayList;
import java.util.List;

public class FakeModel8 implements Model8 {

    private ModelData9 modelData = new ModelData9();

    @Override
    public ModelData9 getModelData() {
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
}