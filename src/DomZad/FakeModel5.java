package DomZad;
import java.util.ArrayList;
import java.util.List;

public class FakeModel5 implements Model5 {

    private ModelData6 modelData = new ModelData6();

    @Override
    public ModelData6 getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User7> users = new ArrayList<>();
        users.add(new User7("A", 1l, 1));
        users.add(new User7("B", 2l, 1));
        modelData.setUsers(users);
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }
}