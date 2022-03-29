package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class KataTest {

    @Test
    public void addTest() {
        Kata calculator = new Kata();
        //int result = calculator.add(4, 3);
        assertEquals(7, calculator.add(4, 3));
    }

    @Test
    public void subtractionTest() {
        Kata calculator = new Kata();
        //int result = calculator.subtract(7, 2);
        assertEquals(5, calculator.subtract(7, 2));
    }

    @Test
    public void absoluteSubtractionTest() {
        Kata calculator = new Kata();
        //int result = calculator.subtract(2, 7);
        assertEquals(5, calculator.subtract(2, 7));
    }

    @Test
    public void multiplicationTest() {
        Kata calculator = new Kata();
        //int result = calculator.multiply(3, 4);
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    public void circleAreaTest() {
        Kata circle = new Kata();
        double result = circle.findArea(7);
        assertEquals((22 * 7 * 7) / 7, result);
    }

    @Test
    public void triangleAreaTest() {
        Kata triangle = new Kata();
        double result = triangle.triangleArea(4, 5);
        assertEquals(10, result);
    }

    @Test
    public void bitFlipperTest() {
        Kata flipper = new Kata();
        int result = flipper.flip(1);
        assertEquals(0, result);

        result = flipper.flip(0);
        assertEquals(1, result);
    }

    @Test
    public void utmeDrillerTest() {
        Kata utme = new Kata();
        //int price = utme.unitOrdered(5);
        assertEquals(6000, utme.unitOrdered(3));
    }

    @Test
    public void quotientTest() {
        Kata numbers = new Kata();
        double result = numbers.quotient(100, 20);
        assertEquals(5, result);
    }


//    @Test
//    public void whileTest() {
//        int number = 2;
//        while (number <= 100) {
//            System.out.print(number + " ");
//            number = number + 2;
//        }
//    }

    @Test
    public void evenOddTest() {
        Kata number = new Kata();
        boolean result = number.isEven(100);
        assertTrue(result);
    }

//    @Test
//    public void palindromeTest() {
//        Kata digits = new Kata();
//        digits.isPalindrome(12345);
//        assertEquals(false, digits.isPalindrome(););
//    }
}


