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

    @Override
    public String status(){
        String superStatus = super.status();
        return superStatus + " Размах крыльев: " + wingspan + " метров, минимальная длина взлетно-посадочной полосы для взлета: "
                + minAccelerationBand + " метров, наличие системы катапулдьтрования: " + isEjectionSystem + ", количество ракет на борту: "
                + countOfMissiles;

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