package Hw_les22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Salon car = new Salon();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Внесите модель машины: ");
        String model = scanner.nextLine();
        scanner.close();
        car.findCar(model);
        //System.out.println(car.toString());
    }
}
