package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceTo() {
       Point a = new Point (4, 3);
       Point b =new Point (5,6);
    double result = a.distanceTo(b);
    assertThat(result, is(3.1622776601683795));
    }

    @Test
    public void distanceTo2() {
        Point a = new Point (0, 1);
        Point b =new Point (2,5);
        double result = a.distanceTo(b);
        assertEquals(result, 4, +1e10);
    }


}