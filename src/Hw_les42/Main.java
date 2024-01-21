package Hw_les42;

public class Main {
    /*
    Задача1
Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода int a = 40/0

Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода
String s =null;
String m = s.toLowerCase()

Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода
int[] m = new int[2]
m[8]=5
     */
    public static void main(String[] args) {
        try {
              int a=40/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("==================");
        try {
            String s =null;
            String m = s.toLowerCase();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("====================");
        try {
            int[] m = new int[2];
            m[8]=5;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
