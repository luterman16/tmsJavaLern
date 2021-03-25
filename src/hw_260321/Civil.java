package hw_260321;

public class Civil extends Air {
    private int countOfPassengers;
    private Boolean isBusinessClass;



    public Civil (Boolean isBusinessClass, int countOfPassengers, String mark,int minAccelerationBand, int wingspan, int mass, double maxSpeed, int power) {
        this.countOfPassengers = countOfPassengers;
        this.isBusinessClass = isBusinessClass;
        this.mark = mark;
        this.minAccelerationBand = minAccelerationBand;
        this.wingspan = wingspan;
        this.mass = mass;
        this.maxSpeed = maxSpeed;
        this.power = power;
    }

    public String status(){
        double powerKV = power * 0.74;
        return "Марка: " + mark + " Масса: " + mass + "кг, Максимальная скорость: " + maxSpeed + "км/ч, Мощность: "
                + power + " лошадиных сил, Размах крыльев: " + wingspan + " метров, минимальная длина взлетно-посадочной полосы для взлета: "
                + minAccelerationBand + " метров, количество пассажиров: " + countOfPassengers + ", наличие бизнес-класса: "
                + isBusinessClass + ", мощность: " + powerKV + " Кв.";

    };

    public void loadCivilAirplan (int passengers){
        String result = passengers <= countOfPassengers ? "Самолет загружен" : "Нужен Самолет побольше";
        System.out.println(result);
    }
}
