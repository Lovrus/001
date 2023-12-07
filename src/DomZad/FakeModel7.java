package DomZad;
import java.util.ArrayList;
import java.util.List;

public class FakeModel7 implements Model {

    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("A", 1l, 1));
        users.add(new User("B", 2l, 1));
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
}