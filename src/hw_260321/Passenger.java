package hw_260321;

public class Passenger extends Ground {
    private String bodyType;
    private int countOfPassengers;


    public Passenger(String bodyType, int countOfPassengers, int numberOfWeels, double fuelConsumption, int power, double maxSpeed, int mass, String mark) {
        this.bodyType = bodyType; //ип кузова
        this.countOfPassengers = countOfPassengers; // коли-во пассажирова
        this.numberOfWeels = numberOfWeels; // кол-во колес
        this.fuelConsumption = fuelConsumption; // расходтоплива
        this.power = power; /// мощность в лс.с
        this.maxSpeed = maxSpeed; // макс скорость
        this.mass = mass; // масса
        this.mark = mark; // маррка
    }


    public String status() {
        double powerKV = power * 0.74;
        return "Марка: " + mark + " Масса: " + mass + "кг, Максимальная скорость: " + maxSpeed + "км/ч, Мощность: "
                + power + " лошадиных сил, тип кузова: " + bodyType + ", количество пассажиров: "
                + countOfPassengers + ", количество колес: " + numberOfWeels + ", расход топлива: "
                + fuelConsumption + " литров/100км, мощность: " + powerKV + " Кв.";
    };

    public void distanceAndFuelConsumption(double timeOfHours){
        double distance = maxSpeed * timeOfHours;
        double fuelConsumptionResult = calcFuelConsumotion(distance);

        System.out.printf("За время %s ч, автомобиль %s, двигаясь с максимальной скоростью %s км/ч проедет %s к и израсходует %s литров топлива. \n", timeOfHours, mark, maxSpeed,distance, fuelConsumptionResult );
    };

    private double calcFuelConsumotion (double distance){
        return distance / 100 * fuelConsumption;
    }
}

