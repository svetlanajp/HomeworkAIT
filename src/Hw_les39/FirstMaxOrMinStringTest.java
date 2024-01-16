package Hw_les39;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstMaxOrMinStringTest {
FirstMaxOrMinString ret=new FirstMaxOrMinString();

@Test
    public void findFirstShortOrLangMethod_oneElt_test(){
    List<String> list= new ArrayList<>();
    list.add("kkk");
    assertEquals("kkk",ret.findFirstShortOrLang(list));
}
    @Test
    public void findFirstShortOrLangMethod_severalMaxElt_test(){
        List<String> list= new ArrayList<>();
        list=List.of("kkk","ffff","ggggg","ddddddddddd","aa");
        assertEquals("ddddddddddd",ret.findFirstShortOrLang(list));
    }
    @Test
    public void findFirstShortOrLangMethod_severalMinxElt_test(){
        List<String> list;
        list=List.of("kkk","ffff","aa","ggggg","ddddddddddd");
        assertEquals("aa",ret.findFirstShortOrLang(list));
    }
}