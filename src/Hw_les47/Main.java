package Hw_les47;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Person> persons = List.of(new Person("John",19),
                                       new Person("Bill",23),
                                       new Person("Ann",18),
                                       new Person("Mary",16),
                                       new Person("Jack",50),
                                       new Person("Peter",15));
        System.out.println("=======Task1==========");
        System.out.println(retListPersonAgeKey(persons));
        System.out.println("=========Task21========");
        System.out.println(countSumAgePersonMore18(persons));
        System.out.println("========Task22=========");
        System.out.println(convertNamePersonToString(persons));
        System.out.println("=========Task3==========");
        String str1="aaaaaaa cccc ab bbbbb a ff aaa abcdf";
        String str2="ab";
        System.out.println(countWordStartWithString(str1,str2));
    }
    /*
    Задача 1
Пусть есть класс Person с полями имя и возраст. Написать метод,
принимающий список Person и возвращающий мапу, где возраст является
ключом, а лист людей этого возраста значением*/
    public static Map<Integer, List<Person>>  retListPersonAgeKey(List<Person> personList){
        return personList.stream().
                collect(Collectors.groupingBy(Person::getAge,Collectors.toList()));
    }

    /*
  Задача 2
Есть тот же класс Person с полями String name, int age.
Написать метод,принимающий список Person и возвращающий
суммарный возраст тех, кто старше 18 лет*/
    public static int countSumAgePersonMore18(List<Person> list){
        return list.stream()
                .filter(a -> a.getAge() > 18).mapToInt(Person::getAge).sum();
    }

/*Написать метод,принимающий список Person и возвращающий имена тех,
кто старше 18 лет в виде такой строки:
"At the moment John and Ann and Bill are of legal age "
( имена и текст могут быть любыми, по вашему выбору,
структура предложения должна сохраняться)
*/
    public static String convertNamePersonToString(List<Person> personList){
        return  personList.stream()
                .filter(a->a.getAge()>18).map(Person::getName)
                .collect(Collectors.joining(" and ","At the moment "," are of legal age"));
    }


/*Задача 3
Написать метод, принимающий в качестве параметров две строки.
 Первая строка состоит из слов, разделенных пробелом.
 Метод возвращает количество слов первой строки, начинающихся со второй строки
Пример : Первая строка "aaaaaaa cccc ab bbbbb a ff aaa"
Если вторая строка а, то ответ 4
Если вторая строка ааа, ответ 2
Если вторая строка aaaa, ответ 1

В решении всех задач использовать стримы !
     */
    public static int countWordStartWithString(String str1, String str2){
        String[] words = str1.split(" ");
    return (int)Arrays.stream(words).filter(w1->w1.startsWith(str2)).count();
    }
}
