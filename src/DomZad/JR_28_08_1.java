package DomZad;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Глубокое клонирование карты
*/

public class JR_28_08_1 implements Cloneable {
    public static void main(String[] args) {
        JR_28_08_1 solution = new JR_28_08_1();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        JR_28_08_1 clone = null;
        try {
            clone = (JR_28_08_1) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap<>();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;

            if (age != user.age) return false;
            return name != null ? name.equals(user.name) : user.name == null;
        }

        @Override
        public int hashCode() {
            int result = age;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        JR_28_08_1 o = (JR_28_08_1) super.clone();

        //clone users
        Map<String, User> newUsers = new LinkedHashMap<>();
        for (String key : o.users.keySet()) {
            User user = o.users.get(key);
            newUsers.put(key, (User) user.clone());
        }
        o.users = newUsers;

        return o;
    }
}
