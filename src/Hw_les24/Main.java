package Hw_les24;

/*
Задача 1
Написать как минимум одну иерархию классов
в которой будет один родительский класс и два наследника, расширяющих его функционал
 */
public class Main {
    public static void main(String[] args) {
        School school = new School();
        school.nameSchool();
        Parents parents1 = new Parents(10, "Sergey", "Petrakov");
        System.out.println();
        School parent2 = new Parents(9, "Lana", "Magas");
        System.out.println();
        School parent3 = new Parents(9, "Irina","Magas");
        System.out.println();
        Subject subject1 = new Subject(9, "Romashkina", "Biologic");
        System.out.println();
        School teacher2 = new Teacher(9, "Tuchkina");
    }
}