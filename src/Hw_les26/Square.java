package Hw_les26;

public class Square extends Figure {
    Square(double length) {
        super(length);
    }

    public void findArea() {
        System.out.println("Square has area of " + (length * length));
    }

    @Override
    public String toString() {
        return "Square: " + "length=" + length;
    }
}
