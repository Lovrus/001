package Java_H_Schildt.chapter_2_21;

import java.util.*;

public class SampleRB extends ListResourceBundle {
    protected Object[][] getContents() {
        Object[][] resources = new Object[3][2];
        resources[0][0] = "title";
        resources[0][1] = "My Program";
        resources[1][0] = "StopNext";
        resources[1][1] = "Stop";
        resources[2][0] = "StartText";
        resources[2][1] = "Start";
        return resources;
    }
}
