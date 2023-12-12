package Hw_les24;

public class Subject extends Teacher {
    String tSubject;

    public Subject(int numberClass, String surname, String tSubject) {
        super(numberClass, surname);
        this.tSubject = tSubject;
        System.out.println("\t\tSubject is " + tSubject);

    }

}
