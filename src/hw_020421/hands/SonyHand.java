package hw_020421.hands;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
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
