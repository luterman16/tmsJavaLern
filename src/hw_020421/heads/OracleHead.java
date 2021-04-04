package hw_020421.heads;

public class OracleHead implements IHead {
    private int price;

    public OracleHead(int price){
        this.price = price;
    }

    public OracleHead(){
    }


    @Override
    public void speek() {
        System.out.println("Голова говорит Oracle");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
