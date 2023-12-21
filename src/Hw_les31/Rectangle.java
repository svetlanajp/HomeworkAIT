package Hw_les31;

public class Rectangle implements Shape {
    String name;
    double length;
    double width;

    public Rectangle(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public double findArea() {
        return length * width;
    }

    public double findPerimeter() {
        return ((length + width) * 2);
    }
}
