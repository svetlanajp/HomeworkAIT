package Hw_les26;

public class Circle extends Figure {
    Circle(double length) {
        super(length);
    }

    public void findArea() {
        System.out.println("Circle has area of " + (length * length / (4 * 3.14)));
    }

    @Override
    public String toString() {
        return "Circle: " + "length= " + length;
    }
}
