package Hw_les31;

public class Circle implements Shape {
    String name;
    double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double findArea() {
        return PI * radius * radius;
    }

    public double findPerimeter() {
        return 2 * radius * PI;
    }
}
