package DomZad;
/*
Template pattern
*/

public class JR_21_12_2 {
    public static void main(String[] args) {
        DrinkMaker latteMaker = new LatteMaker();
        DrinkMaker teaMaker = new TeaMaker();

        latteMaker.makeDrink();
        teaMaker.makeDrink();
    }
}
