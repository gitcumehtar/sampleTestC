import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    @Test
    public void testMultiplyTwoPositiveValues() {
        assertEquals("11 * 7 must be 77", 77, calc.multiply(11, 7));
    }

    @Test
    public void testDivisionTwoPositiveValues() {
        assertEquals("60 / 3 must be 20", 20, calc.division(60, 3));
    }

    @Test
    public void testSubtractionTwoNegativeValues() {
        assertEquals("18 - 17 must be 1", 1, calc.subtraction(18, 17));
    }

    @Test
    public void testPow2TwoValues() {
        assertEquals("5 * 5 must be 25", 25, calc.pow2(5));
    }

    @Test
    public void testSqrt() {
        assertEquals("144 sqrt 12", 12.0, calc.sqroot(144));
    }

    @Test
    public void testDivisionZero() {
        String msg = "";
        {
            try {
                calc.division(-55, 0);
            } catch (java.lang.ArithmeticException e) {
                msg = e.getMessage();
            }

            assertEquals("not 0","/ by zero", msg);

        }

        //TODO
        //add new tests for add() method

        //TODO
        //add tests for new methods


    }


    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }
}
