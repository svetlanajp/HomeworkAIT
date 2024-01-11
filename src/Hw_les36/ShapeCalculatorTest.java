package Hw_les36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {
    Shape1 circle = new Circle1(10.0);
    Shape1 rectangle = new Rectangle1(10.0, 15.0);
    Shape1[] shapes1 = {circle, rectangle};
    ShapeCalculator shc = new ShapeCalculator();

    @Test
    public void totalSquare() {
        assertEquals(464, shc.totalSquare(shapes1));
    }

    @Test
    public void zeroElement_test() {
        Shape1[] actual = {};
        assertEquals(-1, shc.totalSquare(actual));
    }
    @Test
    public void OneCircleElement_test() {
        Shape1[] actual = {circle};
        assertEquals(314, shc.totalSquare(actual));
    }
    @Test
    public void OneRectangleElement_test() {
        Shape1[] actual = {rectangle};
        assertEquals(150, shc.totalSquare(actual));
    }
}