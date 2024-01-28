package DomZad;
public final class Util9 {
    public static final String DELETED_MARKER = " (deleted)";

    public static boolean isUserDeleted(User10 user) {
        return user.getName().endsWith(DELETED_MARKER);
    }

    public static void markDeleted(User10 user) {
        if (User10.NULL_USER != user && !Util9.isUserDeleted(user)) {
            user.setName(user.getName() + DELETED_MARKER);
        }
    }
}