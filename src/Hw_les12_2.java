import java.util.Scanner;
public class Hw_les12_2 {
    // Переписать задачу про треугольник из предыдущего дз используя циклы for
    /*Написать метод, выводящий на печать треугольник, состоящий из цифр от 1 до числа n такого вида:
        1
        12
        123
        1234
        12345
        123456*/
    public static void main(String[] args) {
        printTriangleNum();
    }
    static void printTriangleNum() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = myScanner.nextInt();
        int i;

        for (i = 1; i <= n; i++) {
            int j;
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}