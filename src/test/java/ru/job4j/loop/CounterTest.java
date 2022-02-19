package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumNumbersFromOneToTenThenFiftyFive() {
        int start = 1;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromMinusSixToFiveThenMinusSix() {
        int start = -6;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = -6;
        Assert.assertEquals(expected, result);
    }
}