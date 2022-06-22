package DomZad;
import java.util.HashMap;
import java.util.Map;

/*
Коллекция Map из котов
*/

public class JR_14_3_6 {

    public static void main(String[] args) {
        String[] catsArray = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(catsArray);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> map = new HashMap<>();
        for (String name : cats) {
            map.put(name, new Cat(name));
        }
        return map;
    }

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
