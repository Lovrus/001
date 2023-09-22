package DomZad;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model {

    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User3> users = new ArrayList<>();
        users.add(new User3("A", 1l, 1));
        users.add(new User3("B", 2l, 1));
        modelData.setUsers(users);
    }
}
