package les18_1_2;
public class Main {
    public static void main(String[] args) {
        /*Задача 1
    Создать класс Student c полями (переменными) имя и возраст.
    Создать несколько обьектов этого класса. Вывести их на печать*/
        Student stud1 = new Student();
        stud1.name = "Lana";
        stud1.age = 20;
        System.out.println("Student 1 name: " + stud1.name + ". Age " + stud1.age);

        Student stud2 = new Student("Den", 21);
        System.out.println("Student 2 name: " + stud2.name + ". Age " + stud2.age);

        /*Задача 2
    Создать класс Rectangle (прямоугольник), содержащий переменные
    длина и ширина, конструктор и методы для подсчета площади и
    периметра прямоугольника. В классе Main создать
    несколько обьектов класса Rectangle и вывести на экран площадь
    и периметр каждого*/
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Площадь прямоугольника: " + rectangle1.findAreaRectangle(4, 5));
        System.out.println("Периметр прямоугольника: " + rectangle1.findPerimRectangle(4, 5));

        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 3;
        rectangle2.width = 2;
        System.out.println("Площадь прямоугольника: " + rectangle2.findAreaRectangle(rectangle2.length, rectangle2.width));
        System.out.println("Периметр прямоугольника: " + rectangle2.findPerimRectangle(rectangle2.length, rectangle2.width));

        Rectangle rectangle3=new Rectangle(4,5);
        System.out.println("Площадь прямоугольника: " + rectangle3.findAreaRectangle1());
        System.out.println("Периметр прямоугольника: " + rectangle3.findPerimRectangle1());

    }

}
