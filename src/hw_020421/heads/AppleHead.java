package hw_020421.heads;

public class AppleHead implements IHead {
    private int price;

    public AppleHead(int price){
        this.price = price;
    }

    public AppleHead(){
    }


    @Override
    public void speek() {
        System.out.println("Голова говорит Apple");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
