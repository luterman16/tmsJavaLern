package hw_020421.hands;

public class OracleHand implements IHand {
    private int price;

    public OracleHand(int price) {
        this.price = price;
    }

    public OracleHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Рука поднята");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
