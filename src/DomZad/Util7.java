package DomZad;
public final class Util7 {
    public static final String DELETED_MARKER = " (deleted)";

    public static boolean isUserDeleted(User9 user) {
        return user.getName().endsWith(DELETED_MARKER);
    }

    public static void markDeleted(User9 user) {
        if (User9.NULL_USER != user && !Util7.isUserDeleted(user)) {
            user.setName(user.getName() + DELETED_MARKER);
        }
    }
}