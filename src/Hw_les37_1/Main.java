package Hw_les37_1;

/*
Задача 1
Разобраться в коде занятия (our arraylist).
В классе Main создать несколько обьектов OurArrayList, вызвать методы, посмотреть как они работают

 */
public class Main {
    public static void main(String[] args) {
        OurList<Integer> ourList = new OurArrayList<>();
        ourList.append(4);
        ourList.append(5);
        ourList.append(15);
        ourList.append(7);
        System.out.println("List size is " + ourList.size());
        for (int i = 0; i < ourList.size(); i++) {
            System.out.print(ourList.get(i)+" ");
        }
        System.out.println();
        ourList.set(67, 2);
        ourList.append(6);
        System.out.println("Now list size is " + ourList.size());
        for (int i = 0; i < ourList.size(); i++) {
            System.out.print(ourList.get(i)+" ");
        }
        System.out.println();
//        ourList.removeById(4);
//        System.out.println("Remove "+ourList.removeById(4));
//        for (int i = 0; i < ourList.size(); i++) {
//            System.out.print(ourList.get(i)+" ");
//        }

    }
}
