package Hw_les44;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
    Task 1
Создать следующие интерфейсы:
Printable, содержащий метод void print(String s)
Producable, содержащий метод String produce()
Используя эти интерфейсы написать 2 лямбды, реализующие метод
соответствующего интерфейса таким образом:

1.строка распечатывается в виде !строка!
2.возвращается строка "Hello World"*/
        Printable printable = s -> System.out.println("!" + s + "!");
        printable.print("string");

        Producable producable = () -> "Hello world";
        System.out.println(producable.produce());

/*
Task 2
Написать метод, принимающий имя файла и лист Person.
Метод сохраняет в этот файл обьекты класса Person из листа
( класс Person имеет 2 поля name и age- см код занятия).
     */
        File file = new File("hw_les44_2.txt");
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", 25));
        personList.add(new Person("Bill", 37));
        personList.add(new Person("Ann", 34));
        personList.add(new Person("Mary", 19));


        writeListToFile(file, personList);
    }
    public static void writeListToFile(File fileName, List<Person> person) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (Person p : person) {
                bufferedWriter.write(p.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
