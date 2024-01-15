package Hw_les38;

import java.util.ArrayList;
import java.util.List;

/*
Написать метод, принимающий два листа целых чисел одинаковой длины и
возвращающий лист, содержащий элементы Yes или No, где значения на i-м месте
зависит от того, равны ли элементы этих двух листов под номером i.
Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
Протестировать.
 */
public class EqualListMethod {

    public static List<String> findEquals(List<Integer> int1, List<Integer> int2) {

        List<String> newAr = new ArrayList<>();
        if (int1.size() != int2.size()) {
            return null;
        }
        for (int i = 0; i < int1.size(); i++) {
            if (int1.get(i).equals(int2.get(i))) {
                newAr.add(i, "YES");
            } else newAr.add(i, "NO");
        }
        return newAr;
    }

}
