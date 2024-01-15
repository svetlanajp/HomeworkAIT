package Hw_les38;

import java.util.Arrays;
import java.util.List;



/*
Написать метод, принимающий два листа целых чисел одинаковой длины и
возвращающий лист, содержащий элементы Yes или No, где значения на i-м месте
зависит от того, равны ли элементы этих двух листов под номером i.
Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
Протестировать.
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 2, 3, 8);

        System.out.println("Size 1 list is " + list1.size());
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("Size 2 list is " + list2.size());
        for (Integer integer : list2) {
            System.out.print(integer + " ");
        }
        System.out.println("\n"+"=========");
        System.out.println(EqualListMethod.findEquals(list1, list2));
    }

}
