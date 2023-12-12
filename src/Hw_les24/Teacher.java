package Hw_les24;

public class Teacher extends Classs {
    String surname;

    public Teacher(int numberClass, String surname) {
        super(numberClass);
        this.surname = surname;
        System.out.println("\tTeacher's name " + surname);
    }

}
