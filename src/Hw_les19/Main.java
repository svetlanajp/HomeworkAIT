package Hw_les19;

public class Main {
    /* Задача 1
   Создать класс Temperature (температура), содержащий метод для перевода
   градусов по фаренгейту в градусы цельсия ( celsius = 5*(farenheit - 32)/9).
   В классе Main создать несколько обьектов класса Temperature (значение температуры
   по фаренгейту должно задаваться через конструктор)
   и вывести результат перевода на экран*/
    public static void main(String[] args) {
        Temperature temp1 = new Temperature(155);
        System.out.println("Fahrenheit = " + temp1.fahrenheit + ". Celsius = " + temp1.gradCels());
        Temperature temp2 = new Temperature(-100);
        System.out.println("Fahrenheit = " + temp2.fahrenheit + ". Celsius = " + temp2.gradCels());
        Temperature temp3 = new Temperature(0);
        System.out.println("Fahrenheit = " + temp3.fahrenheit + ". Celsius = " + temp3.gradCels());
        Temperature temp4 = new Temperature(123.8);
        System.out.println("Fahrenheit = " + temp4.fahrenheit + ". Celsius = " + temp4.gradCels());
        Temperature temp5 = new Temperature(451);
        System.out.println("Fahrenheit = " + temp5.fahrenheit + ". Celsius = " + temp5.gradCels());
    }
}
