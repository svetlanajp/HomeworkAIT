package Hw_les26;

public class Main {
    /*
    Геометрические фигуры:
    Используя свойство наследования написать программу для подсчета площади трех видов фигур
    - круга, прямоугольника и квадрата.
    Созать классы Circle,Rectangle, Square, содержащие соответствующие методы.
    Затем в методе Main создать массив из нескольких фигур и вывести на печать площади каждой фигуры
    и название ее.
    Пример:
    Circle has area of 100.0
    Rectangle has area of 400.0
    Square has area of 340.0
     */
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(4);
        Rectangle rectangle1 = new Rectangle(5, 4);
        Rectangle rectangle2 = new Rectangle(3.14, 6);
        Square square1 = new Square(6.15);
        Square square2 = new Square(9);
        Figure figure1=new Figure();

        Figure[] figure = {rectangle1, rectangle2, square1, square2, circle1, circle2, figure1};
        for (Figure f : figure) {
            System.out.println(f);
            f.findArea();
        }
    }
}

