package DomZad;
public final class Util5 {
    public static final String DELETED_MARKER = " (deleted)";

    public static boolean isUserDeleted(User7 user) {
        return user.getName().endsWith(DELETED_MARKER);
    }

    public static void markDeleted(User7 user) {
        if (User7.NULL_USER != user && !Util5.isUserDeleted(user)) {
            user.setName(user.getName() + DELETED_MARKER);
        }
    }
}