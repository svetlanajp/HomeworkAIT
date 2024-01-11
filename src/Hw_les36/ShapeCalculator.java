package Hw_les36;

public class ShapeCalculator {
    //метод вычисления общей площади фигур
    public double totalSquare(Shape1[] shapes1) {
        if (shapes1.length == 0) return -1;

        double res = 0;
        for (Shape1 shape1 : shapes1) {
            res += shape1.area();
        }
        return res;
    }
}
