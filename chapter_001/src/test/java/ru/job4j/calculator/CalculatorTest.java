package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDiv2On2Then1() {
        Calculator calc = new Calculator();
        calc.div(2D, 2D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMul4On2Then8() {
        Calculator calc = new Calculator();
        calc.mul(4D, 2D);
        double result = calc.getResult();
        double expected = 8D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSub5of2Then3() {
        Calculator calc = new Calculator();
        calc.sub(5D, 2D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }
}