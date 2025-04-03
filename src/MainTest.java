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
        assertEquals(15, Main.sumRange(1, 5));
    }

    @Test
    void reversedRangeTest() {
        assertEquals(15, Main.sumRange(5, 1));
    }

    @Test
    void negativeToPositiveRangeTest() {
        assertEquals(0, Main.sumRange(-3, 3));
    }

    @Test
    void singleNumberRangeTest() {
        assertEquals(7, Main.sumRange(7, 7));
    }

    @Test
    void negativeRangeTest() {
        assertEquals(-10, Main.sumRange(-4, -1));
    }

    @Test
    void largeRangeTest() {
        assertEquals(5050, Main.sumRange(1, 100));
    }

    // 2

    @Test
    void addPositiveIntegersTest() {
        assertEquals(12, Main.add(5, 7));
    }

    @Test
    void addZeroIntegersTest() {
        assertEquals(0, Main.add(0, 0));
    }

    @Test
    void addNegativeIntegersTest() {
        assertEquals(-5, Main.add(-3, -2));
    }

    @Test
    void addMixedIntegersTest() {
        assertEquals(100, Main.add(50, 50));
    }

    @Test
    void addStringsTest() {
        assertEquals("Hello, World!", Main.add("Hello, ", "World!"));
    }

    @Test
    void addStringWithNumbersTest() {
        assertEquals("12345", Main.add("12", "345"));
    }

    @Test
    void addEmptyStringsTest() {
        assertEquals("", Main.add("", ""));
    }

    @Test
    void addStringWithWhitespaceTest() {
        assertEquals("Hello  World", Main.add("Hello", "  World"));
    }

    //3

    @Test
    void validArrayTest() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        assertEquals(6, Main.findMax(numbers));
    }

    @Test
    void singleElementArrayTest() {
        int[] numbers = {10};
        assertEquals(10, Main.findMax(numbers));
    }

    @Test
    void equalElementsArrayTest() {
        int[] numbers = {7, 7, 7, 7};
        assertEquals(7, Main.findMax(numbers));
    }

    @Test
    void negativeNumbersArrayTest() {
        int[] numbers = {-5, -3, -1, -7};
        assertEquals(-1, Main.findMax(numbers));
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
        assertEquals(120, Main.getFactorial(5));
    }

    @Test
    void zeroFactorialTest() {
        assertEquals(1, Main.getFactorial(0));
    }

    @Test
    void oneFactorialTest() {
        assertEquals(1, Main.getFactorial(1));
    }

    @Test
    void largeNumberFactorialTest() {
        assertEquals(3628800, Main.getFactorial(10));
    }

    @Test
    void negativeNumberFactorialTest() {
        assertThrows(IllegalArgumentException.class, () -> Main.getFactorial(-5));
    }

    //5

    @Test
    void calculateCircleAreaTest() {
        double expectedArea = Math.PI * 5 * 5;
        assertEquals(expectedArea, Main.calculateArea(5));
    }

    @Test
    void calculateCircleAreaNegativeRadiusTest() {
        assertThrows(IllegalArgumentException.class, () -> Main.calculateArea(-5));
    }

    @Test
    void calculateCircleAreaZeroRadiusTest() {
        assertEquals(0, Main.calculateArea(0));
    }

    @Test
    void calculateRectangleAreaTest() {
        assertEquals(45, Main.calculateArea(15, 3));
    }

    @Test
    void calculateRectangleAreaNegativeLengthTest() {
        assertThrows(IllegalArgumentException.class, () -> Main.calculateArea(-10, 4));
    }

    @Test
    void calculateRectangleAreaNegativeWidthTest() {
        assertThrows(IllegalArgumentException.class, () -> Main.calculateArea(10, -4));
    }

    @Test
    void calculateRectangleAreaZeroLengthTest() {
        assertEquals(0, Main.calculateArea(0, 5));
    }

    @Test
    void calculateRectangleAreaZeroWidthTest() {
        assertEquals(0, Main.calculateArea(5, 0));
    }

    //6

    @Test
    void calculateAveragePositiveNumbersTest() {
        int expectedAverage = (4 + 7 + 10) / 3;
        assertEquals(expectedAverage, Main.calculateAverage(4, 7, 10));
    }

    @Test
    void calculateAverageNegativeNumbersTest() {
        int expectedAverage = (-4 + -7 + -10) / 3;
        assertEquals(expectedAverage, Main.calculateAverage(-4, -7, -10));
    }

    @Test
    void calculateAverageMixedNumbersTest() {
        int expectedAverage = (4 + -7 + 10) / 3;
        assertEquals(expectedAverage, Main.calculateAverage(4, -7, 10));
    }

    @Test
    void calculateAverageSameNumbersTest() {
        int expectedAverage = (5 + 5 + 5) / 3;
        assertEquals(expectedAverage, Main.calculateAverage(5, 5, 5));
    }

    @Test
    void calculateAverageZerosTest() {
        int expectedAverage = (0 + 0 + 0) / 3;
        assertEquals(expectedAverage, Main.calculateAverage(0, 0, 0));
    }

    @Test
    void calculateAverageLargeNumbersTest() {
        int expectedAverage = (1000000 + 2000000 + 3000000) / 3;
        assertEquals(expectedAverage, Main.calculateAverage(1000000, 2000000, 3000000));
    }

    //7

    @Test
    void calculateHypotenuseValidIntegersTest() {
        assertEquals(10.0, Main.calculateHypotenuse(6, 8));
    }

    @Test
    void calculateHypotenuseValidDoublesTest() {
        assertEquals(7.905694150420948, Main.calculateHypotenuse(4.5, 6.5));
    }

    @Test
    void calculateHypotenuseNegativeValuesTest() {
        assertThrows(IllegalArgumentException.class, () -> Main.calculateHypotenuse(-3, -4));
    }

    @Test
    void calculateHypotenuseNegativeValueATest() {
        assertThrows(IllegalArgumentException.class, () -> Main.calculateHypotenuse(-3, 4));
    }

    @Test
    void calculateHypotenuseNegativeValueBTest() {
        assertThrows(IllegalArgumentException.class, () -> Main.calculateHypotenuse(3, -4));
    }

    @Test
    void calculateHypotenuseZeroValuesTest() {
        assertThrows(IllegalArgumentException.class, () -> Main.calculateHypotenuse(0, 0));
    }

    @Test
    void calculateHypotenuseZeroValueATest() {
        assertThrows(IllegalArgumentException.class, () -> Main.calculateHypotenuse(0, 4));
    }

    @Test
    void calculateHypotenuseZeroValueBTest() {
        assertThrows(IllegalArgumentException.class, () -> Main.calculateHypotenuse(3, 0));

    }
}