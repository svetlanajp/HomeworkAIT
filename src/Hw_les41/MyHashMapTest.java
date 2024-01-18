package Hw_les41;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyHashMapTest {

    private MyHashMap myHashMap;

    @BeforeEach
    public void setUp() {
        myHashMap = new MyHashMap();
    }

    @Test
    public void findNameOccurrence_test(){
        List<String> list=List.of("John", "John", "John", "Bill");
        assertEquals(3,myHashMap.findNameOccurrence(list,"John"));
    }
    @Test
    public void findName_empty_test(){
        List<String> list=List.of();
        assertEquals(0,myHashMap.findNameOccurrence(list,"Bill"));
    }

}