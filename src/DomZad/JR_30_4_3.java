package DomZad;
/*
Inner 2
*/

public class JR_30_4_3 {
    private String country;
    private String city;

    public JR_30_4_3(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public SuperUser getTrickyUser(String name) {
        return new SuperUser(name);
    }

    public String getUserDescription(String name) {
        return getTrickyUser(name).getDescription();
    }

    private class SuperUser {
        private String name;

        public SuperUser(String name) {
            this.name = name;
        }

        //доступ к этому методу возможен только внутри класса Solution, т.к. модификатор класса private
        public String getDescription() {
            return String.format("My name is %s. I'm from %s in %s.", this.name, JR_30_4_3.this.city, JR_30_4_3.this.country);
        }
    }

    public static void main(String[] args) {
        JR_30_4_3 solution = new JR_30_4_3("the United States", "Seattle");
        //внутри класса Solution (а сейчас мы внутри) к методу getDescription можно обращаться обоими способами
        System.out.println(solution.getTrickyUser("George").getDescription());
        //а из любого другого внешнего класса только так:
        System.out.println(solution.getUserDescription("George"));
    }
}
