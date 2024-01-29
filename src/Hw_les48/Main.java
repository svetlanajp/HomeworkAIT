package Hw_les48;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    /*
    1.Получить и вывести на экран:
-текущую дату
-текущий год, месяц и день
2.Создать дату , например день рождения и вывести на экран
3.Создать две даты и проверить на равенство
4.Получить и вывести на экран текущее время
5.текущее время + 3 часа
6.Создать дату на неделю позже сегодняшней
7.Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
     */
    public static void main(String[] args) {
        //1.Получить и вывести на экран:
        //-текущую дату
        //-текущий год, месяц и день
        LocalDate localDateNow = LocalDate.now();
        System.out.println("Today is " + localDateNow);
        System.out.println("Today is year "+localDateNow.getYear());
        System.out.println("Today is month "+localDateNow.getMonth());
        System.out.println("Today is month "+localDateNow.getMonthValue());
        System.out.println("Today is day of month "+localDateNow.getDayOfMonth());
        //System.out.println("Today is day of week "+localDateNow.getDayOfWeek());
        //System.out.println("Today is day of year "+localDateNow.getDayOfYear());



        //2.Создать дату , например день рождения и вывести на экран
        LocalDate ld3 = LocalDate.of(1981, 5, 7);
        System.out.println("My date is " + ld3);

        //3.Создать две даты и проверить на равенство
        LocalDate d = LocalDate.of(2024, 1, 23);
        LocalDate d1 = LocalDate.of(2023, 12, 23);
        System.out.println(d.equals(d1));

        //4.Получить и вывести на экран текущее время
        LocalTime localTimeNow = LocalTime.now();
        System.out.println("Local time is " + localTimeNow);

        //5.текущее время + 3 часа
        LocalTime lt1 = localTimeNow.plusHours(3);
        System.out.println("Local time +3 hour " + lt1);

        //6.Создать дату на неделю позже сегодняшней
        LocalDate nextWeekDay = localDateNow.plusWeeks(1);
        System.out.println("Date a week later " + nextWeekDay);

        //7.Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
        LocalDate tomorrow = localDateNow.plusDays(1);
        LocalDate yesterday = localDateNow.minusDays(1);
        System.out.println("Tomorrow is before today " + tomorrow.isBefore(localDateNow));
        System.out.println("Tomorrow is after today " + tomorrow.isAfter(localDateNow));
        System.out.println("Yesterday is before today " + yesterday.isBefore(localDateNow));
        System.out.println("Yesterday is after today " + yesterday.isAfter(localDateNow));
    }
}
