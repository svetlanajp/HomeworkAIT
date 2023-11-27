public class Hw_les13_1_2 {
    /*  Задача1
  -Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
  -Вывести созданный массив на экран используя цикл for.
  -Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
  -Вывести измененный массив на экран используя цикл for.
      Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.*/
    public static void main(String[] args) {
        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits[" + i + "] = " + fruits[i]);
        }
        System.out.println("\tArray with Kiwi");
        fruits[0] = "Kiwi";
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits[" + i + "] = " + fruits[i]);
        }

      /*Задача2
      Используя цикл for вывести на экран все четные элементы массива fruits из первой задачи.
      Задание можно выполнить непосредственно в методе main либо создать отдельный метод.*/
        System.out.println("\tEven array elements");
        for (int i = 0; i < fruits.length; i++) {
            if (i % 2 == 0) {
                System.out.println("fruits[" + i + "] = " + fruits[i]);
            }
        }
    }
}
