public class Hw_les14_1_2 {

    public static void main(String[] args) {
        int[] ar1 = {1,2,3,4,5};
        int[] ar2 = {1,2,3,4,5};
        System.out.println("Arrays are equal? " +areEqual(ar1,ar2));
        int[] arr3 = {1,2,8,7,12,7};
        System.out.println("Count of even numbers is " +returnCountOfEvenNumbers(arr3));
    }
    // написать метод, проверяющий равенство двух массивов целых чисел. В случае, если массивы равны, метод
    /*    возвращает true,  если нет то false. Массивы равны если они одинаковые
    {1,2,3}
    {1,2,3}     */
    public static boolean areEqual(int[] array1, int[] array2) {

        if (array1.length != array2.length)
            return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    /*Задача2
    Есть массив целых чисел. Написать метод, находящий и
    возвращающий количество четных чисел в этом массиве.
    Пример: {1, 2, 8, 7} -> количество четных чисел = 2.*/
    public static int returnCountOfEvenNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }
}