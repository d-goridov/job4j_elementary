package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MinDiapasonTest {

    @Test
    public void whenFirstMin() {
        int[] array = new int[] {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {-1, 0, 5, 10, -2, 18};
        int start = 1;
        int finish = 4;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = -2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {3, 0, 40, 10, -15, 32, 11};
        int start = 2;
        int finish = 5;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = -15;
        Assert.assertEquals(expected, result);
    }
}