package hw_020421.legs;

public class ApplyLeg implements ILeg {
    private int price;

    public ApplyLeg(int price){
        this.price = price;
    }

    public ApplyLeg(){
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
