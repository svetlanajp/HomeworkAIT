package Hw_les24;

public class Parents extends Student {
    String parentsSurname;

    public Parents(int numberClass, String name, String parentsSurname) {
        super(numberClass, name);
        this.parentsSurname = parentsSurname;
        System.out.println("\t\tParent's last name " + parentsSurname);
    }
}
