public class Hw_les16_1_2_3 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Double length of the " + str + " is: " + returnDoubleLength(str));
        String str1 = "There";
        System.out.println("Connected strings " + str + ", " + str1 + " without first letter in upper case: " + returnJoinString(str, str1));
        String str2 = "abcd";
        System.out.println("Sorted string " + str2 + " : " + returnSortedString(str2));
    }

    /*Задача 1
        Написать метод, принимающий строку и
        возвращающий целое число, равное двойной длине строки
        Пример: Hello -> 10*/
    public static int returnDoubleLength(String str) {
        return str.length() * 2;
    }

    /* Задача 2
        Написать метод, принимающий две строки
        и возвращающий эти строки, соединенные вместе,
        но без первых букв и в верхнем регистре.
        Пример: "Hello", "There" -> ELLOHERE*/
    public static String returnJoinString(String str1, String str2) {
        return String.join("", str1.substring(1).toUpperCase(), str2.substring(1).toUpperCase());
        //return str1.concat(str2.substring(1)).substring(1).toUpperCase();
    }

    /*Задача 3*
        Написать метод, принимающий строку и возвращающий эту строку с
        переставленной в конец строки первой буквой.
        Примет: abcd -> bcda*/
    public static String returnSortedString(String str) {
        char[] ch = str.toCharArray();
        return str.substring(1) + ch[0];
    }
}

