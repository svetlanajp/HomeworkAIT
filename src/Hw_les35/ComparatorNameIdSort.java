package Hw_les35;

import java.util.Comparator;

public class ComparatorNameIdSort implements Comparator<Employee> {

    public int compare(Employee em1, Employee em2) {
        int emplName = em1.getFirstName().compareTo(em2.getFirstName());
        return emplName == 0 ? Integer.compare(em1.getId(), em2.getId()) : emplName;
    }
}
