package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] array = {{10}};
        int result = MatrixSum.sum(array);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTwo() {
        int[][] array = {{1, 5}, {7, 9}};
        int result = MatrixSum.sum(array);
        int expected = 22;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThree() {
        int[][] array = {{1, 5, 6}, {7, 9, 0}};
        int result = MatrixSum.sum(array);
        int expected = 28;
        Assert.assertEquals(expected, result);
    }
}