package DomZad;

import java.util.Properties;

public class Cat15 {
    public static int catCount = 0;
    public static String namePrefix;

    static {
        Properties p = null;
        String s;
        // s = (String) new Properties(Integer.parseInt("name-prefix"));

        Properties properties = new Properties();

         properties = (Properties) p.get("name-prefix");
    }

    public static int maxCatCount = 50;

    static {
        var p = new Properties();
       // p.load ("max.properties");
        if (p.get("cat-max") != null)
            maxCatCount = (int) p.get("cat-max");
    }
}
