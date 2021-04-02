package hw_260321;

public abstract class Transport {
    protected int power;
    protected double maxSpeed;
    protected int mass;
    protected String mark;

    protected double getTransportPower(){
        return  power * 0.74;
    };

    public String status() {
        double powerKV = getTransportPower();
        return "Марка: " + mark + " Масса: " + mass + "кг, Максимальная скорость: " + maxSpeed + "км/ч, Мощность: "
                + power + " лошадиных сил, мощность: " + powerKV;
    };
}
