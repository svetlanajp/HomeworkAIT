package Hw_les21;

public class Dog {
    /*
    Задача 1
Создать класс Dog c полями name , counter и конструктором.
Cоздать несколько обьектов этого класса и
вывести на печать количество созданных обьектов.
     */
    private String name;
    private int age;
    static int counter;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    @Override
    public String toString() {
        return "Dog " +"name=" + name +", age=" + age ;
    }
}
