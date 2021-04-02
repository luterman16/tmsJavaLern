package hw_260321;

public class App {
    public static void main(String[] args) {

        //Легковой автомобиль
        Passenger passenger = new Passenger("Кроссовер",
                5,
                4,
                8.5,
                256,
                193,
                2339,
                "Jeep");
        //Выводим информацию по дистанции и расходу топлива
        passenger.distanceAndFuelConsumption(1.2);

        //Грузовой автомобиль
        Cargo cargo = new Cargo(5,
                "Фургон",
                3,
                6,
                12,
                193,
                110,
                2500,
                "Iveco"
        );
        //Выводим инфо, по вместимости
        cargo.loadTruck(4.9);
        System.out.println(cargo.status());

        //Гражданский самолет
        Civil civil = new Civil(
                false,
                8,
                "Airobus",
                100,
                1,
                150,
                240,
                1000
        );
        //Выводим инфо, по вместимости
        civil.loadCivilAirplan(50);

        //Военный самолет
        Military military = new Military(
                true,
                0,
                "Airobus Arm",
                1500,
                5,
                890,
                1500.7,
                700);

        //Запуск ракеты
        military.piupiu(1);

        //Запуск катапульты
        military.catapults();
    }
}
