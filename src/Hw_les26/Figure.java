package Hw_les26;

public class Figure {
    double length;
    Figure(){}
    Figure(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void findArea() {
        System.out.println("Can find area");
    }

    public String toString() {
        return "Figure: " + "length= " + length;
    }
}
