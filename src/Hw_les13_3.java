
/*Задача3
     Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
     public static int findMin(int[] ints)*/
public class Hw_les13_3 {
    public static void main(String[] args) {

        int[] array = new int[8];
        System.out.println("Min number of array  " + findMin(array));
    }

    public static int findMin(int[] ints) {
        int[] array = {5, 2, 8, 0, 1, 7, -67, 45};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
