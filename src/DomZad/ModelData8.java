package DomZad;
import java.util.List;

public class ModelData8 {

    private List<User9> users;
    private User9 activeUser;
    private boolean displayDeletedUserList;

    public List<User9> getUsers() {
        return users;
    }

    public void setUsers(List<User9> users) {
        this.users = users;
    }

    public User9 getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User9 activeUser) {
        this.activeUser = activeUser;
    }

    public boolean isDisplayDeletedUserList() {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }
}