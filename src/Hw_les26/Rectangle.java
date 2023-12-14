package Hw_les26;

public class Rectangle extends Figure {
    double width;

    Rectangle(double length, double width) {
        super(length);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void findArea() {
        System.out.println("Rectangle has area of " + (getLength() * getWidth()));
    }

    @Override
    public String toString() {
        return "Rectangle: " + "length= " + getLength() + ", width= " + getWidth();
    }
}
