package hw_260321;

public class Military extends Air {
    private Boolean isEjectionSystem;
    private int countOfMissiles;


    public Military(Boolean isEjectionSystem, int countOfMissiles, String mark,int minAccelerationBand, int wingspan, int mass, double maxSpeed, int power) {
        this.isEjectionSystem = isEjectionSystem;
        this.countOfMissiles = countOfMissiles;
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
                + minAccelerationBand + " метров, наличие системы катапулдьтрования: " + isEjectionSystem + ", количество ракет на борту: "
                + countOfMissiles + ", мощность: " + powerKV + " Кв.";

    };

    public void piupiu (int missiles) {
        String result = countOfMissiles > 0 ? "Ракета пошла !" : "Боеприпасы отсутсвуют";
        System.out.println(result);
    }

    public void catapults(){
       String result =  isEjectionSystem ?  "Катапультирование прошло успешно" : "У Вас нет такой системы";
        System.out.println(result);
    }


}