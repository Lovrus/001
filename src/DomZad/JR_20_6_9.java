package DomZad;

import java.util.ArrayList;
import java.util.List;

/*
Валюты
*/

public class JR_20_6_9 {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    public static class Person {
        public String name;

        public Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            allMoney.add(new Hryvnia(2000));
            allMoney.add(new USD(700));
            allMoney.add(new Ruble(7000));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
