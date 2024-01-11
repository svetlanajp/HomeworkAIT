package Hw_les36;

public class Circle1 implements Shape1 {

    double radius;

    public Circle1(double radius) {

        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}
