package hw_020421.legs;

public class OracleLeg implements ILeg {
    private int price;

    public OracleLeg(int price){
        this.price = price;
    }

    public OracleLeg(){
    };

    @Override
    public void step() {
        System.out.println("Сделан шаг ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
