package Hw_les46;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========Task1===========");
        List<String> names = List.of("John", "Bill", "Bill", "Ann", "Jack", "Mary", "Peter", "John", "Mary", "John");
        printNameWithoutRepeat(names);
        System.out.println("==========Task2===========");
        Person p1 = new Person("John", 21, new Address("Street1", 23));
        Person p2 = new Person("Bill", 16, new Address("Street2", 3));
        Person p3 = new Person("Ann", 50, new Address("Street3", 44));
        Person p4 = new Person("Mary", 27, new Address("Street4", 12));
        Person p5 = new Person("Jack", 15, new Address("Street5", 5));
        List<Person> personList = List.of(p1, p2, p3, p4, p5);
        printPersonOver17(personList);

    }
    /*
    Задача 1
Написать метод, принимающий лист имен, в котором некоторые имена
повторяются и печатающий имена из листа без печати повторений.
 При решении использовать Stream API
     */

    public static void printNameWithoutRepeat(List<String> names) {
        names.stream().distinct().forEach(System.out::println);
    }

    /*
Задача 2
Есть класс Address с полями String street и int houseNumber
и класс Person с полями String name, int age, Address address.
Используя Stream API написать метод, принимающий лист Person
и печатающий адреса тех, кто старше 17 лет
     */
    public static void printPersonOver17(List<Person> personList) {
        personList.stream().filter(age -> age.getAge() > 17).forEach(s -> System.out.println(s.getAddress()));
        personList.stream().filter(age -> age.getAge() > 17).map(address -> "Address: " + address.getAddress()).forEach(System.out::println);
    }
}
