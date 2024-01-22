package Hw_les43;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Main m=new Main();
        File file1=new File("Hw_task1.txt");
        File file2=new File("Hw_task2.txt");
        System.out.println(m.findSumValuesInFile(file1));
        System.out.println(m.findMaxStringInFile(file2));
    }
    /*
    Task 1
1.Пусть есть текстовый файл такого вида:
1
2
3
4
5
Нужно написать метод, принимающий файл и возвращающий сумму всех значений
*/
public int findSumValuesInFile(File file) {
    int sum = 0;
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String str;
        while ((str = br.readLine()) != null) {
            sum += Integer.parseInt(str);
        }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    return sum;
}


    /*
Task 2
Написать метод, принимающий текстовый файл, состоящий из нескольких
строчек разной длины и возвращающий самую длинную строчку.
Пример
файл:
aaa
bbbbbbbbbb
cc
вернет метод: bbbbbbbbbb
     */
    public String findMaxStringInFile(File file) {
        String maxString = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int max = 0;
            String str;
            while ((str = br.readLine()) != null) {
                if (str.length() > max) {
                    max = str.length();
                    maxString = str;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return maxString;
    }

}
