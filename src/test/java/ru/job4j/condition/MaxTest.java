package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax4to7Then7() {
        int left = 4;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax12to3Then12() {
        int left = 12;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3to3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3to5to3Then5() {
        int first = 3;
        int second = 5;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax0to4to7Then7() {
        int first = 0;
        int second = 4;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3to5to9toMinus3Then9() {
        int first = 3;
        int second = 5;
        int third = 9;
        int forth = -3;
        int result = Max.max(first, second, third, forth);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}