package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {7, 4, 3};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEq() {
        int[] left = {4, 2, 3, 10, 20};
        int[] right = {7, 4, 3, 4, 8};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }
}