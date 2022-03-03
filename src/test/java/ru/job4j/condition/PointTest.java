package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenThis01Another20ThenDistance2dot24() {
        Point point1 = new Point(0, 1);
        Point point2 = new Point(2, 0);
        double result = point1.distance(point2);
        double expected = 2.24;
        Assert.assertEquals(expected, result, 0.01);

    }

    @Test
    public void whenThis11Another33ThenDistance2dot83() {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(3, 3);
        double result = point1.distance(point2);
        double expected = 2.83;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenThis01Another20ThenDistance3dot17() {
        Point point1 = new Point(2, 0);
        Point point2 = new Point(5, 1);
        double result = point1.distance(point2);
        double expected = 3.17;
        Assert.assertEquals(expected, result, 0.01);
    }
}