package Hw_les38;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class EqualListMethodTest {


    @Test
    public void findEqualsMethod_testEmpty() {
        List<Integer> list1 = List.of();
        List<Integer> list2 = List.of();
        List<String> expected = List.of();
        assertEquals(expected, EqualListMethod.findEquals(list1, list2));
    }

    @Test
    public void findEqualsMethod_testSeveralElm() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 2, 3, 8);
        List<String> expected = Arrays.asList("NO", "YES", "YES", "NO");
        assertEquals(expected, EqualListMethod.findEquals(list1, list2));
    }

    @Test
    public void findEqualsMethod_testAllElmDifferent() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
        List<String> expected = Arrays.asList("NO", "NO", "NO", "NO");
        assertEquals(expected, EqualListMethod.findEquals(list1, list2));
    }

    @Test
    public void findEqualsMethod_testDifferentSizeList() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(0, 2, 4, 5, 6);
        assertNull(EqualListMethod.findEquals(list1, list2));
    }
}
