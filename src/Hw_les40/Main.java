package Hw_les40;

import java.util.HashMap;
import java.util.Map;

/*
Дана Map<String, String> map, написать метод, который вернет Мап,
такую, что если в исходной map есть ключи ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’
с суммой значений от ключей a и b. Если нет, ничего не менять.
Примеры:
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
 */
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Map<String, String> items = new HashMap<>();
        items.put("a", "Hi");
        items.put("b", "There");
        Map<String, String> items1 = new HashMap<>();
        items1.put("d", "Hi");
        items1.put("c", "There");
        Map<String, String> a = new HashMap<>();
        a.put("a", "Hi");
        a.put("c", "There");
        Map<String, String> b = new HashMap<>();
        b.put("d", "Hi");
        b.put("b", "There");
        System.out.println("Key A and B consist: " + m.createNewKeyWithSumOfValues(items));
        System.out.println("Key A and B not consist: " + m.createNewKeyWithSumOfValues(items1));
        System.out.println("Only key A consist: " + m.createNewKeyWithSumOfValues(a));
        System.out.println("Only key B consist: " + m.createNewKeyWithSumOfValues(b));

    }

    public Map<String, String> createNewKeyWithSumOfValues(Map<String, String> items) {
        Map<String, String> newMap = new HashMap<>(items);
            if (items.containsKey("a") && items.containsKey("b")) {
                newMap.put("ab", items.get("a")+items.get("b"));
                return newMap;
            }
        return items;
    }
}

