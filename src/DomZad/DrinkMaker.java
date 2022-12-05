package DomZad;

public abstract class DrinkMaker {
    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }

    public abstract void getRightCup();

    public abstract void putIngredient();

    public abstract void pour();
}
