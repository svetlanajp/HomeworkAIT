package Hw_les24;

public class Student extends Classs {
    String name;

    public Student(int numberClass, String name) {
        super(numberClass);
        this.name = name;
        System.out.println("\tStudent name " + name);
    }
}

