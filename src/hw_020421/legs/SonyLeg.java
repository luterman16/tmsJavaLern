package hw_020421.legs;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price){
        this.price = price;
    }

    public SonyLeg(){
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
