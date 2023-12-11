package Hw_les23;

/*
Задача 1
Создать класс Calculator, способный выполнять два арифметических действия - сложение двух чисел,
вычитание двух чисел а также сложение трех чисел и вычитание трех чисел.
Калькулятор должен работать как для целых чисел, так и для чисел с запятой.
(т.е. в классе надо создать соответствующие методы и затем вызывать их в методе main)
 */
public class Calculator {
     double sum(double x, double y) {
        return x + y;
    }

    static double sum(double x, double y, double z) {
        return x + y + z;
    }

    static double substr(double x, double y) {
        return x - y;
    }

     double substr(double x, double y, double z) {
        return x - y - z;
    }
}
