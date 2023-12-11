package Hw_les23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Внесите 3 числа: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        scanner.close();
        Calculator calc1 = new Calculator();
        System.out.println(x + " + " + y + " = " + calc1.sum(x, y));
        System.out.println(x + " + " + y + " + " + z + " = " + Calculator.sum(x, y, z));
        System.out.println(x + " - " + y + " = " + Calculator.substr(x, y));
        System.out.println(x + " - " + y + " - " + z + " = " + calc1.substr(x, y, z));
        System.out.println("++++++++++++++++++++++++++");
        Calculator2 calc = new Calculator2();
        calc.sumAndSubstr();
    }
}
