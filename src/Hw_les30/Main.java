package Hw_les30;

import java.util.Scanner;
/*
Написать программу, которая при вводе с клавиатуры дня недели отвечает на вопрос
является ли этот день выходным. (true/false) Использовать Enum !
 */
public class Main {
    public static void main(String[] args) {
        boolean b = false;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter day of week: ");
        String str = myScanner.nextLine();
        DayWeek day = DayWeek.valueOf(str.toUpperCase());

        if (day == DayWeek.SUNDAY || day == DayWeek.SATURDAY) {
            b = true;
        }
        System.out.println(day + " is a day off? " + b);
    }
}

