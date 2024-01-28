package DomZad;
import java.util.List;

public class ModelData10 {

    private List<User10> users;
    private User10 activeUser;
    private boolean displayDeletedUserList;

    public List<User10> getUsers() {
        return users;
    }

    public void setUsers(List<User10> users) {
        this.users = users;
    }

    public User10 getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User10 activeUser) {
        this.activeUser = activeUser;
    }

    public boolean isDisplayDeletedUserList() {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }
}