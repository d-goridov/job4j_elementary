package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when01to20then2dot24() {
        double expected = 2.24;
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when11to33then2dot83() {
        double expected = 2.83;
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to51then3dot17() {
        double expected = 3.17;
        int x1 = 2;
        int y1 = 0;
        int x2 = 5;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
}