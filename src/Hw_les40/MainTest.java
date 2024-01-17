package Hw_les40;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    Main m = new Main();

    @Test
    public void createNewKeyWithSumOfValues_test() {
        Map<String, String> actual = new HashMap<>();
        actual.put("a", "Hi");
        actual.put("b", "There");
        Map<String, String> expected = new HashMap<>(actual);
        expected.put("ab", "HiThere");
        assertEquals(expected, m.createNewKeyWithSumOfValues(actual));
    }

    @Test
    public void createNewKeyWithSumOfValues_oneElt_test() {
        Map<String, String> expected = new HashMap<>();
        expected.put("a", "Hi");
        assertEquals(expected, m.createNewKeyWithSumOfValues(expected));
    }

    @Test
    public void createNewKeyWithSumOfValues_severalElt_test() {
        Map<String, String> actual = new HashMap<>();
        actual.put("b", "There");
        actual.put("c", "world");
        actual.put("d", "!");
        actual.put("a", "Hi");
        Map<String, String> expected = new HashMap<>(actual);
        expected.put("ab", "HiThere");
        assertEquals(expected, m.createNewKeyWithSumOfValues(actual));
    }
}