package Hw_les31;

/*
Создать интерфейс Shape, содержащий методы для подсчета площади и периметра фигуры
и классы прямоугольник и круг, реализующие этот интерфейс.
В методе main создать несколько фигур и вывести на печать площадь и периметр каждой.
Написать метод, вычисляющий общую площадь фигур нескольких видов.
 */
public class Main {
    public static void main(String[] args) {
        Shape cir1 = new Circle("Circle", 5);
        Shape cir2 = new Circle("Circle", 4);
        Shape rec1 = new Rectangle("Rectangle", 4, 5);
        Shape rec2 = new Rectangle("Rectangle", 8, 3.14);
        Shape[] shapes = {cir1, cir2, rec1, rec2};

        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " has area = " + shape.findArea());
            System.out.println(shape.getName() + " has perimeter = " + shape.findPerimeter());
            System.out.println("++++++++++++++++++++++++++++++++++++");
        }
        System.out.println("Total area of figures =" + findSumArea(shapes));
    }

    public static double findSumArea(Shape[] shapes) {
        double sum = 0;
//        for (int i = 0; i < shapes.length; i++) {
//            sum = sum + shapes[i].findArea();
//        }

        for (Shape shape : shapes) {
            sum = sum + shape.findArea();
        }

        return sum;
    }
}
