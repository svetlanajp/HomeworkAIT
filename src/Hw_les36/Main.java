package Hw_les36;

/*
Создать интерфейс Shape, содержащий методы для подсчета площади и периметра фигуры и классы прямоугольник и круг, реализующие этот интерфейс.
В методе main создать несколько фигур и вывести на печать площадь и периметр каждой.
Написать метод, вычисляющий общую площадь фигур нескольких видов.
Протестировать метод, находящий общую площадь фигур из домашнего задания урока 31
 */
public class Main {
    public static void main(String[] args) {
        Shape1 circle = new Circle1(10.0);
        System.out.println("Circle perimeter: " + circle.perimeter());
        System.out.println("Circle area: " + circle.area());

        Shape1 rectangle = new Rectangle1(10.0, 15.0);
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle area: " + rectangle.area());

        Shape1[] shapes1 = {circle, rectangle};
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("Total square is: " + shapeCalculator.totalSquare(shapes1));
    }
}
