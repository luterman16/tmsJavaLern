package hw_260321;

public class Cargo extends Ground {
    private double loadCapacity;


    public Cargo(double loadCapacity, String bodyType, int countOfPassengers, int numberOfWeels, double fuelConsumption, int power, double maxSpeed, int mass, String mark) {
        this.loadCapacity = loadCapacity;
        this.numberOfWeels = numberOfWeels;
        this.fuelConsumption = fuelConsumption;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.mark = mark;
    }

    public String status() {
        double powerKV = power * 0.74;
        return "Марка: " + mark + " Масса: " + mass + "кг, Максимальная скорость: " + maxSpeed + "км/ч, Мощность: "
                + power + " лошадиных сил, грузоподъемность: " + loadCapacity + ", количество колес: " + numberOfWeels + ", расход топлива: "
                + fuelConsumption + " литров/100км, мощность: " + powerKV + " Кв.";
    };

    public void loadTruck (double cargo){
        String result = cargo <= loadCapacity ? "Грузовик загружен" : "Нужен грузовик побольше";
        System.out.println(result);
    }

}
