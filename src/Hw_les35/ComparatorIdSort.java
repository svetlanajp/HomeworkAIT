package Hw_les35;

import java.util.Comparator;

public class ComparatorIdSort implements Comparator<Employee> {
    public int compare(Employee em1, Employee em2) {
        return Integer.compare(em1.getId(), em2.getId());
    }
}
