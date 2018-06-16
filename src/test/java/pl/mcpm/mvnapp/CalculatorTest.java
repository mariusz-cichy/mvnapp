package pl.mcpm.mvnapp;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    static private Calculator calculator;

    @BeforeClass
    static public void beforeClass() {
        calculator = new Calculator();
        System.out.println("BeforeClass");
    }

    @Test
    public void test_add_ok() {
        int a = 5;
        int b = 10;
        assertEquals(15.0, calculator.add(a, b), 0);
    }

    @Test
    public void test_add_wrong() {
        int a = 6;
        int b = 10;
        assertEquals(16, calculator.add(a, b));
    }

}
