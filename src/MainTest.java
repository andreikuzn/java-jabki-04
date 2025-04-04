import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class MainTest {

    @Test
    void hello() {
        String name = "Котик";
        assertEquals("Hello " + name, Main.hello(name));
    }

    @Test
    void multiply() {
        int a = 2, b = 3;
        assertEquals(a * b, Main.multiply(a, b));
    }

    /**
     * дз4
     */

    // 1

    @Test
    void positiveRangeTest() {
        int start = 1;
        int end = 5;
        int expected = 15;
        assertEquals(expected, Main.sumRange(start, end));
    }

    @Test
    void reversedRangeTest() {
        int start = 5;
        int end = 1;
        int expected = 15;
        assertEquals(expected, Main.sumRange(start, end));
    }

    @Test
    void negativeToPositiveRangeTest() {
        int start = -3;
        int end = 3;
        int expected = 0;
        assertEquals(expected, Main.sumRange(start, end));
    }

    @Test
    void singleNumberRangeTest() {
        int start = 7;
        int end = 7;
        int expected = 7;
        assertEquals(expected, Main.sumRange(start, end));
    }

    @Test
    void negativeRangeTest() {
        int start = -4;
        int end = -1;
        int expected = -10;
        assertEquals(expected, Main.sumRange(start, end));
    }

    @Test
    void largeRangeTest() {
        int start = 1;
        int end = 100;
        int expected = 5050;
        assertEquals(expected, Main.sumRange(start, end));
    }

    // 2

    @Test
    void addPositiveIntegersTest() {
        int a = 5;
        int b = 7;
        int expected = 12;
        assertEquals(expected, Main.add(a, b));
    }

    @Test
    void addZeroIntegersTest() {
        int a = 0;
        int b = 0;
        int expected = 0;
        assertEquals(expected, Main.add(a, b));
    }

    @Test
    void addNegativeIntegersTest() {
        int a = -3;
        int b = -2;
        int expected = -5;
        assertEquals(expected, Main.add(a, b));
    }

    @Test
    void addMixedIntegersTest() {
        int a = 50;
        int b = 50;
        int expected = 100;
        assertEquals(expected, Main.add(a, b));
    }

    @Test
    void addStringsTest() {
        String a = "Hello, ";
        String b = "World!";
        String expected = "Hello, World!";
        assertEquals(expected, Main.add(a, b));
    }

    @Test
    void addStringWithNumbersTest() {
        String a = "12";
        String b = "345";
        String expected = "12345";
        assertEquals(expected, Main.add(a, b));
    }

    @Test
    void addEmptyStringsTest() {
        String a = "";
        String b = "";
        String expected = "";
        assertEquals(expected, Main.add(a, b));
    }

    @Test
    void addStringWithWhitespaceTest() {
        String a = "Hello";
        String b = "  World";
        String expected = "Hello  World";
        assertEquals(expected, Main.add(a, b));
    }

    //3

    @Test
    void validArrayTest() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int expected = 6;
        assertEquals(expected, Main.findMax(numbers));
    }

    @Test
    void singleElementArrayTest() {
        int[] numbers = {10};
        int expected = 10;
        assertEquals(expected, Main.findMax(numbers));
    }

    @Test
    void equalElementsArrayTest() {
        int[] numbers = {7, 7, 7, 7};
        int expected = 7;
        assertEquals(expected, Main.findMax(numbers));
    }

    @Test
    void negativeNumbersArrayTest() {
        int[] numbers = {-5, -3, -1, -7};
        int expected = -1;
        assertEquals(expected, Main.findMax(numbers));
    }

    @Test
    void emptyArrayTest() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> Main.findMax(numbers));
    }

    @Test
    void nullArrayTest() {
        assertThrows(IllegalArgumentException.class, () -> Main.findMax(null));
    }

    // 4

    @Test
    void positiveNumberFactorialTest() {
        int input = 5;
        int expected = 120;
        assertEquals(expected, Main.getFactorial(input));
    }

    @Test
    void zeroFactorialTest() {
        int input = 0;
        int expected = 1;
        assertEquals(expected, Main.getFactorial(input));
    }

    @Test
    void oneFactorialTest() {
        int input = 1;
        int expected = 1;
        assertEquals(expected, Main.getFactorial(input));
    }

    @Test
    void largeNumberFactorialTest() {
        int input = 10;
        int expected = 3628800;
        assertEquals(expected, Main.getFactorial(input));
    }

    @Test
    void negativeNumberFactorialTest() {
        int input = -5;
        assertThrows(IllegalArgumentException.class, () -> Main.getFactorial(input));
    }

    //5

    @Test
    void calculateCircleAreaTest() {
        double radius = 5.0;
        double expectedArea = Math.PI * radius * radius;
        assertEquals(expectedArea, Main.calculateArea(radius));
    }

    @Test
    void calculateCircleAreaZeroRadiusTest() {
        double radius = 0.0;
        double expectedArea = 0.0;
        assertEquals(expectedArea, Main.calculateArea(radius));
    }

    @Test
    void calculateCircleAreaNegativeRadiusTest() {
        double radius = -5.0;
        assertThrows(IllegalArgumentException.class, () -> Main.calculateArea(radius));
    }

    @Test
    void calculateRectangleAreaTest() {
        double length = 15;
        double width = 3;
        double expectedArea = 45;
        assertEquals(expectedArea, Main.calculateArea(length, width));
    }

    @Test
    void calculateRectangleAreaZeroLengthTest() {
        double length = 0;
        double width = 5;
        double expectedArea = 0;
        assertEquals(expectedArea, Main.calculateArea(length, width));
    }

    @Test
    void calculateRectangleAreaZeroWidthTest() {
        double length = 5;
        double width = 0;
        double expectedArea = 0;
        assertEquals(expectedArea, Main.calculateArea(length, width));
    }

    @Test
    void calculateRectangleAreaNegativeLengthTest() {
        double length = -10;
        double width = 4;
        assertThrows(IllegalArgumentException.class, () -> Main.calculateArea(length, width));
    }

    @Test
    void calculateRectangleAreaNegativeWidthTest() {
        double length = 10;
        double width = -4;
        assertThrows(IllegalArgumentException.class, () -> Main.calculateArea(length, width));
    }

    //6

    @Test
    void calculateAveragePositiveNumbersTest() {
        int a = 4, b = 7, c = 10;
        int expectedAverage = (a + b + c) / 3;
        assertEquals(expectedAverage, Main.calculateAverage(a, b, c));
    }

    @Test
    void calculateAverageNegativeNumbersTest() {
        int a = -4, b = -7, c = -10;
        int expectedAverage = (a + b + c) / 3;
        assertEquals(expectedAverage, Main.calculateAverage(a, b, c));
    }

    @Test
    void calculateAverageMixedNumbersTest() {
        int a = 4, b = -7, c = 10;
        int expectedAverage = (a + b + c) / 3;
        assertEquals(expectedAverage, Main.calculateAverage(a, b, c));
    }

    @Test
    void calculateAverageSameNumbersTest() {
        int a = 5, b = 5, c = 5;
        int expectedAverage = 5;
        assertEquals(expectedAverage, Main.calculateAverage(a, b, c));
    }

    @Test
    void calculateAverageZerosTest() {
        int a = 0, b = 0, c = 0;
        int expectedAverage = 0;
        assertEquals(expectedAverage, Main.calculateAverage(a, b, c));
    }

    @Test
    void calculateAverageLargeNumbersTest() {
        int a = 1000000, b = 2000000, c = 3000000;
        int expectedAverage = (a + b + c) / 3;
        assertEquals(expectedAverage, Main.calculateAverage(a, b, c));
    }

    //7

    @Test
    void calculateHypotenuseValidIntegersTest() {
        double a = 6;
        double b = 8;
        double expected = 10.0;
        assertEquals(expected, Main.calculateHypotenuse(a, b));
    }

    @Test
    void calculateHypotenuseValidDoublesTest() {
        double a = 4.5;
        double b = 6.5;
        double expected = Math.sqrt(a * a + b * b);
        assertEquals(expected, Main.calculateHypotenuse(a, b));
    }

    @Test
    void calculateHypotenuseNegativeValuesTest() {
        double a = -3.0;
        double b = -4.0;
        assertThrows(IllegalArgumentException.class, () -> Main.calculateHypotenuse(a, b));
    }

    @Test
    void calculateHypotenuseNegativeValueATest() {
        double a = -3.0;
        double b = 4.0;
        assertThrows(IllegalArgumentException.class, () -> Main.calculateHypotenuse(a, b));
    }

    @Test
    void calculateHypotenuseNegativeValueBTest() {
        double a = 3.0;
        double b = -4.0;
        assertThrows(IllegalArgumentException.class, () -> Main.calculateHypotenuse(a, b));
    }

    @Test
    void calculateHypotenuseZeroValuesTest() {
        double a = 0.0;
        double b = 0.0;
        assertThrows(IllegalArgumentException.class, () -> Main.calculateHypotenuse(a, b));
    }

    @Test
    void calculateHypotenuseZeroValueATest() {
        double a = 0.0;
        double b = 4.0;
        assertThrows(IllegalArgumentException.class, () -> Main.calculateHypotenuse(a, b));
    }

    @Test
    void calculateHypotenuseZeroValueBTest() {
        double a = 3.0;
        double b = 0.0;
        assertThrows(IllegalArgumentException.class, () -> Main.calculateHypotenuse(a, b));
    }
}