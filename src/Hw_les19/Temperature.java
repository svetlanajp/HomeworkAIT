package Hw_les19;

public class Temperature {
 /* Задача 1
    Создать класс Temperature (температура), содержащий метод для перевода
    градусов по фаренгейту в градусы цельсия ( celsius = 5*(farenheit - 32)/9).
    В классе Main создать несколько обьектов класса Temperature (значение температуры
    по фаренгейту должно задаваться через конструктор)
    и вывести результат перевода на экран*/

    public double fahrenheit;

    public Temperature(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    double gradCels() {
        return 5 * (fahrenheit - 32) / 9;
    }
}

