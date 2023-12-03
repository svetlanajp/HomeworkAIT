import java.util.Arrays;

public class Hw_les17_1_2_3 {
    public static void main(String[] args) {
        System.out.println(checkAnagram("abcd", "dbca"));
        System.out.println(removeCharAtIndex("Hello",3));
        System.out.println(mySubstring("Hello", 3, 5));

    }
    /*
    1.Написать метод, принимающий две строки и проверяющий является ли одна стока анаграммой другой.
    Метод возвращает boolean
    abcd -bcda acbd -анаграмма  пила-липа
    abcd - acb abkc - не анаграмма
    Могут пригодиться методы:
    toCharArray
    Arrays.sort
     */
    public static boolean checkAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        str1 = Arrays.toString(ch1);
        str2 = Arrays.toString(ch2);
        return str1.equals(str2);
    }

    /* 2
            Написать метод, принимающий строку и целое число(индекс) и возвращающий строку
            без символа, находящегося по этому индексу.
            Пример:
            int index = 3
            String str = "Hello"
    public static String removeCharAtIndex( String str, int index) -> "Helo"*/
    public static String removeCharAtIndex(String str, int index) {
        char[] ch = str.toCharArray();
        String res = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ch[index]) {
                i++;
            }
            res += ch[i];
        }
        return res;
    }

    /*  3*
     Написать свой собственный метод substring, работающий аналогично методу в Джаве. Метод принимает
     строку , индексы начала и конца и возвращает подстроку.
     String mySubstring(String string, int begin, int end).*/
    public static String mySubstring(String string, int begin, int end) {
        char[] ch = string.toCharArray();
        String res = "";
        for (int i = begin; i < end; i++) {
            res = res + ch[i];
        }
        return res;
    }
}