package Hw_les25;

/*
Задача 1
Внести изменения в наш проект Trucks( см. урок 21) таким образом, чтобы класс Truck стал дочерним классом.
Кроме него, также создать еще один дочерний класс , например PassengerCar.
Определить, какие переменные и методы в этом случае должны быть в родительском классе, а какие в дочерних.
 */
public class Main {
    public static void main(String[] args) {

        Truck truck = new Truck("SuperTruck",
                "Volvo",
                2020,
                "red",
                500,
                "John Black",
                5000);
        System.out.println(truck);

        truck.load(1500);
        truck.load(10000);
        truck.load(3500);

        truck.move();
        truck.setCurrentFuel(600);
        truck.move();

        truck.stop();

        truck.unload(10000);
        truck.unload(2000);
        truck.unload(-1000);
        truck.unload(3000);
        Truck truck1 = new Truck("Supertruck1",
                "MAN",
                2018,
                "black-yellow",
                400,
                "Jack White",
                10000);
        Truck[] trucks = {truck, truck1};

        for (Truck tr1 : trucks) {
            System.out.println(tr1);
        }
        System.out.println();

        for (Truck tr : trucks) {
            System.out.println("truck " + tr.getManufacturer() + " : " + tr.getOwner());
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        PassengerCar mazda = new PassengerCar("Mazda", "Mazda", 2020, "Black", 500, "Kraft", 4);
        mazda.move();
        mazda.setCurrentFuel(100);
        mazda.move();
        mazda.countPass(5);
        mazda.countPass(3);
        mazda.move();
        mazda.stop();
        System.out.println();
        PassengerCar volvo = new PassengerCar("volvo", "volvo", 2019, "Blue", 500, "Smith", 5);
        volvo.move();
        volvo.setCurrentFuel(50);
        volvo.countPass(4);
        volvo.move();
        volvo.stop();

        PassengerCar[] passengerCars = {mazda, volvo};

        for (PassengerCar pas : passengerCars) {
            System.out.println(pas);
        }
        System.out.println();

        for (PassengerCar pc : passengerCars) {
            System.out.println("PassengerCar " + pc.getManufacturer() + " : " + pc.getOwner());
        }
    }
}

