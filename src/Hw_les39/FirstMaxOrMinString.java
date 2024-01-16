package Hw_les39;

import java.util.ArrayList;
import java.util.List;

/*
Написать метод, принимающий не пустой лист строк и возвращающий строку,
 которая встречается раньше в листе - самую короткую или самую длинную.
 Все строки в листе разной длины
 */
public class FirstMaxOrMinString {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        FirstMaxOrMinString ret = new FirstMaxOrMinString();
        strings.add("kkddui");
        strings.add("ad");
        strings.add("kkkkkkkkkk");
        strings.add("bcdggty");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println("Result: " + ret.findFirstShortOrLang(strings));
    }

    public String findFirstShortOrLang(List<String> list) {
        String strMax = list.get(0);
        String strMin = list.get(0);
        for (int i=0;i<list.size();i++){
            if (list.get(i).length()>strMax.length()){
                strMax=list.get(i);
            }
            if (list.get(i).length()<strMin.length()){
                strMin=list.get(i);
            }
        }
        return list.indexOf(strMin)<list.indexOf(strMax) ? strMin:strMax;
    }
}




