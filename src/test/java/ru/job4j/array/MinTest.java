package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] array = {4, 6, 7, 9, 21};
        int result = Min.findMin(array);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = {4, 1, 7, 9, 0};
        int result = Min.findMin(array);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {4, 1, -19, 9, 0};
        int result = Min.findMin(array);
        int expected = -19;
        Assert.assertEquals(expected, result);
    }
}