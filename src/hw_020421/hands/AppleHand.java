package hw_020421.hands;

public class AppleHand implements IHand {
    private int price;

    public AppleHand(int price) {
        this.price = price;
    }

    public AppleHand() {
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
