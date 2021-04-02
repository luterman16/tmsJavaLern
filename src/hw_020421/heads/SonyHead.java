package hw_020421.heads;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price){
        this.price = price;
    }

    public SonyHead(){
    }


    @Override
    public void speek() {
        System.out.println("Голова говорит Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
