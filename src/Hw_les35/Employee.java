package Hw_les35;


public abstract class Employee implements Comparable<Employee> {
    private int id;
    private String firstName;
    private String secondName;
    private double hour;

    public Employee(int id, String firstName, String secondName, double hour) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.hour = hour;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getHour() {
        return hour;
    }

    public abstract double calculateSalary();

    //сортировка по фамилии
    public int compareTo(Employee emp) {
//        int playerSecondName = getSecondName().compareTo(emp.getSecondName());
//        return playerSecondName == 0 ? getFirstName().compareTo(emp.getFirstName()) : playerSecondName;
        return getSecondName().compareTo(emp.getSecondName());
    }


    @Override
    public String toString() {
        return "Employee : " +
                "id=" + id +
                ", firstName= " + firstName +
                ", secondName= " + secondName +
                ", hour= " + hour;
    }


}
