package les18_1_2;

public class Rectangle {
    /*Задача 2
    Создать класс Rectangle (прямоугольник), содержащий переменные
    длина и ширина, конструктор и методы для подсчета площади и
    периметра прямоугольника. В классе Main создать
    несколько обьектов класса Rectangle и вывести на экран площадь
    и периметр каждого*/
    public int length;
    public int width;
    public Rectangle(){}

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int findAreaRectangle(int length,int width){
        this.length = length;
        this.width = width;
        return length*width;
    }
    public int findPerimRectangle(int length,int width){
        this.length=length;
        this.width=width;
        return (length+width)*2;
    }
    public int findAreaRectangle1(){
        return length*width;
    }
    public int findPerimRectangle1(){
        return (length+width)*2;
    }
}
