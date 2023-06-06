package DomZad;
public class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        final String string = "%s : %s : %s";
        if (JR_29_05_01.FIRST_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForFirstThread(t, e, string));
        } else if (JR_29_05_01.SECOND_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForSecondThread(t, e, string));
        } else {
            System.out.println(getFormattedStringForOtherThread(t, e, string));
        }
    }

    protected String getFormattedStringForOtherThread(Thread t, Throwable e, String string) {
        return String.format(string, e.getClass().getSimpleName(), e.getCause(), t.getName());
    }

    protected String getFormattedStringForSecondThread(Thread t, Throwable e, String string) {
        return String.format(string, e.getCause(), e.getClass().getSimpleName(), t.getName());
    }

    protected String getFormattedStringForFirstThread(Thread t, Throwable e, String string) {
        return String.format(string, t.getName(), e.getClass().getSimpleName(), e.getCause());
    }
}