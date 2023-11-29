import java.util.Arrays;

public class Hw_les15 {
    /* Написать метод, принимающий массив целых чисел и проверяющий равна ли
     сумма всех имеющихся там чисел 10 тридцати.
     Метод возвращает false если нет и true если да.
     т.е. для массива 10, 15, 10, 1, 25, 10 -> true
     для массива 10, 15, 10, 1, 25, 45 -> false
     Фактически, в общем виде метод проверяет равна ли сумма всех элементов массива, равных n числу m*/
    public static void main(String[] args) {
        int[] arr1 = {10, 15, 10, 1, 25, 10};
        int[] arr2 = {10, 15, 10, 1, 25, 45};
        int[] ar1 = {5, 17, 28, 30, 40, 10, 2, 6, 7, 8, 10, 3, 5, 9, 10};
        int[] ar2 = {5, 17, 10, 30, 40, 10, 5, 10, 7, 8, 10, 3, 5, 9, 10};

        System.out.println("Sum of elements 10 of array " + Arrays.toString(arr1) + " is 30 ? : " + sumNumbersEqualThirty(arr1));
        System.out.println("Sum of elements 10 of array " + Arrays.toString(arr2) + " is 30 ? : " + sumNumbersEqualThirty(arr2));
        System.out.println("Sum of elements 10 of array " + Arrays.toString(ar1) + " is 30 ? : " + sumNumbersEqualThirty(ar1));
        System.out.println("Sum of elements 10 of array " + Arrays.toString(ar2) + " is 30 ? : " + sumNumbersEqualThirty(ar2));
    }

    private static boolean sumNumbersEqualThirty(int[] array) {
        int sum = 0;
        for (int elem : array) {
            if (elem == 10) {
                sum = sum + elem;
                //System.out.println(sum);
            }
        }
        if (sum == 30) {
            return true;
        }
        return false;
    }
}