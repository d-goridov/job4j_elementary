package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 4, 3, 2};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{5, 3, 3, -4, 20};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas21Then3() {
        int[] data = new int[]{0, -98, 15, 21, 3};
        int element = 21;
        int result = FindLoop.indexOf(data, element);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas0ThenMinus1() {
        int[] data = new int[]{53, -54, 13, 2, 11};
        int element = 0;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{53, -54, 13, 2, 11};
        int element = 13;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexOf(data, element, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot21ThenMinus1() {
        int[] data = new int[]{21, -54, 13, 2, 11};
        int element = 21;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, element, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

}