package Hw_les21;

public class Main {
    /*
    Задача 1
Создать класс Dog c полями name , counter и конструктором.
Cоздать несколько обьектов этого класса и вывести на печать
количество созданных обьектов.
     */
    public static void main(String[] args) {
        Dog dog1 = new Dog("Boy", 3);
        Dog dog2 = new Dog("Nessy", 4);
        Dog dog3 = new Dog("Cesar", 2);
        Dog dog4 = new Dog("Jack", 6);

        System.out.println(Dog.counter);

        Dog[] dogs = {dog1, dog2, dog3, dog4};
        for (Dog dog:dogs){
            System.out.println(dog);
        }
    }
}
