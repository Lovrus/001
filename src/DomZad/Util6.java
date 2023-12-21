package DomZad;
public final class Util6 {
    public static final String DELETED_MARKER = " (deleted)";

    public static boolean isUserDeleted(User8 user) {
        return user.getName().endsWith(DELETED_MARKER);
    }

    public static void markDeleted(User8 user) {
        if (User8.NULL_USER != user && !Util6.isUserDeleted(user)) {
            user.setName(user.getName() + DELETED_MARKER);
        }
    }
}