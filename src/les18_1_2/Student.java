package les18_1_2;

public class Student {
    /*Задача 1
    Создать класс Student c полями (переменными) имя и возраст.
    Создать несколько обьектов этого класса. Вывести их на печать*/
    public String name;
    public int age;

    public Student() {
        name = "Student";
        age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
