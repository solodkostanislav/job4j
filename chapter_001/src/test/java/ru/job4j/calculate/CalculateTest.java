package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void whenTakeNameThenTreeEchoPlusName() {
        String input = "Stanislav";
        String expect = "Echo, echo, echo : Stanislav";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }
}