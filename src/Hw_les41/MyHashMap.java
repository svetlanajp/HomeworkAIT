package Hw_les41;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyHashMap {
    /*Задача на мапы: Дан список имен, в котором некоторые имена повторяются.
    Написать метод, который по имени вернет количество вхождений этого имени в список.
    т.е. метод принимает лист и имя и возвращает число, соответствующее количеству раз ,
    которое это имя встречается в листе
      int  findNameOccurrence( List<String> list, String name)
      {"John","Mary","Peter","John","Ann","Mary"}-> John=2; Ann=1; Mary =2
     */
    public static void main(String[] args) {
        MyHashMap m = new MyHashMap();
        List<String> list = List.of("John", "Mary", "Peter", "John", "Ann", "Mary", "Ann", "Peter", "John", "Bill");
        System.out.println("with map " + m.findNameOccurrence(list, "Mary"));
        System.out.println("no map " + searchCountIndexName(list, "Mary"));
    }


    public int findNameOccurrence(List<String> list, String name) {
        Map<String, Integer> myMap = new HashMap<>();
        int index = 0;
        for (String s : list) {
            if (!myMap.containsKey(s)) myMap.put(s, 1);
        }
        for (String s : list) {
            if (myMap.containsKey(s) && s.equals(name)) {
                index++;
                myMap.put(s, index);
            }
        }
        return index;
    }
    public static int searchCountIndexName(List<String> list, String name) {
        int index = 0;
        for (String s : list) {
            if (s.equals(name)) {
                index++;
            }
        }
        return index;
    }

}
