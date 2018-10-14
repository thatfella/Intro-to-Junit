package com.company.java.tests;

import com.company.java.java.Calculator;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    public static final int ZERO = 0;

    private Calculator calculator;

    //Here we can write things that are made before our test runs - e.g. we can put here our Calculator initialization
    @Before
    public void setup() {
        System.out.println("Setting up");
        calculator = new Calculator();
    }

    // clearing varible for example
    @After
    public void tearDown() {
        System.out.println("clearing");
        calculator = null;

    }

    @Test
    public void testSum() {
        System.out.println("test sum");
        int sum = calculator.sum(3, 2);
        Assert.assertThat(sum, Is.is(5));
    }

    @Test
    public void testDiv() {
        System.out.println("test div");
        int div = calculator.divide(20, 4);
        Assert.assertThat(div, Is.is(5));
    }

    //IllegalArgumentException is expected if we have 0
    @Test(expected = IllegalArgumentException.class)
    public void testZeroDivision() {
        System.out.println("test 0-div");
        calculator.divide(100, ZERO);
        Assert.fail();
    }

}
