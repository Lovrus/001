package DomZad;

public class Util4_1 {
    public static final String DELETED_MARKER = " (deleted)";

    public static boolean isUserDeleted(User6 user) {
        return user.getName().endsWith(DELETED_MARKER);
    }

    public static void markDeleted(User6 user) {
        if (User6.NULL_USER != user && !Util4_1.isUserDeleted(user)) {
            user.setName(user.getName() + DELETED_MARKER);
        }
    }
}
