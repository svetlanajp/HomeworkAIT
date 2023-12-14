package Hw_les25;

public class PassengerCar extends Car {

    private int maxPass;

    public PassengerCar(String model,
                        String manufacturer,
                        int year,
                        String color,
                        int maxFuel,
                        String owner,
                        int maxPass) {
        super(model, manufacturer, year, color, maxFuel, owner);
        this.maxPass = maxPass;
    }

    public void countPass(int numPas) {

        if (numPas > maxPass) {
            System.out.println("Too match Passengers!");
            return;
        }
        System.out.println("Passengers - " + numPas);
    }


}
