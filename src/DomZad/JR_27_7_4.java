package DomZad;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Serializable Solution
*/

public class JR_27_7_4 implements Serializable {
    public static void main(String[] args) {
        System.out.println(new JR_27_7_4(4));
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public JR_27_7_4 (int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
