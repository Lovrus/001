package DomZad;
import java.util.ArrayList;
import java.util.List;

public class FakeModel4 implements Model4 {

    private ModelData5 modelData = new ModelData5();

    @Override
    public ModelData5 getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User6> users = new ArrayList<>();
        users.add(new User6("A", 1l, 1));
        users.add(new User6("B", 2l, 1));
        modelData.setUsers(users);
    }
}