package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP5K2ThenSquare1dot39() {
        double expected = 1.39;
        double p = 5;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP3dot5K1dot5ThenSquare0dot74() {
        double expected = 0.74;
        double p = 3.5;
        double k = 1.5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K2ThenSquare5dot56() {
        double expected = 5.56;
        double p = 10;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}