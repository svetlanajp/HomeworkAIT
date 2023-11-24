
import java.util.Scanner;

public class Hw_les12_1 {
    /*Написать метод, принимающий с клавиатуры положительное число
     и печатающий затем таблицу умножения для этого числа
     ( т.е. печатающий произведение этого числа на все числа от 1 до 10).
    Использовать в решении цикл for.
*/
    public static void main(String[] args) {
        multiplTable();
    }

    static void multiplTable() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = myScanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + i * num);
        }
    }
}
