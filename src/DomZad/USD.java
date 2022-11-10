package DomZad;

public class USD extends Money {
    USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }

}
