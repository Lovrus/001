package DomZad;
import java.util.*;

/*
Десять котов
*/

public class JR_16_5_8 {

    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> result = new HashMap<>();

        result.put("васька", new Cat("васька"));
        result.put("мурка", new Cat("мурка"));
        result.put("дымка", new Cat("дымка"));
        result.put("рыжик", new Cat("рыжик"));
        result.put("серый", new Cat("серый"));
        result.put("снежок", new Cat("снежок"));
        result.put("босс", new Cat("босс"));
        result.put("борис", new Cat("борис"));
        result.put("барсик", new Cat("барсик"));
        result.put("гарфи", new Cat("гарфи"));

        return result;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        public String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Cat)) {
                return false;
            }
            Cat cat = (Cat) o;
            return Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
