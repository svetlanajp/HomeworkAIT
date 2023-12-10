package Hw_les22;

import java.util.Arrays;

/*
Задача 1
Написать класс, содержащий метод, который проверяет есть ли данная машина в салоне.
В случае, если машина найдена, метод выводит на экран сообщение "Эта машина имеется в наличии"
Если нет, то сообщение "Такой машины нет , возьмите ( дальше следует перечисление всех машин в салоне ) "
Результат работы метода вывести на экран в классе Main. Список машин в салоне должен передаваться
через конструктор при создании обьекта, а название заказанной машины в качестве параметра метода.
Пример:String [] salon = {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};

public void findCar(String carToFind)
 */

public class Salon {
    private String[] salon = {"Audi", "BMW", "Ford", "Honda", "Hyundai", "Kia", "Mazda"};

    public Salon() {
    }
    public void findCar(String carToFind) {

        boolean cont = false;
        for (String s : salon) {
            if (carToFind.contains(s)) {
                cont = true;
                break;
            }
        }
        if (cont) {
            System.out.println(carToFind + " имеется в наличии");
        } else {
            System.out.println(carToFind + " нет , возьмите : " + Arrays.toString(salon));
        }
    }
    @Override
    public String toString() {
        return "Cars " + "salon= " + Arrays.toString(salon);
    }
}
