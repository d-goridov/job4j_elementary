package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = {1, 3, 5, 7};
        int[] result = Turn.back(input);
        int[] expected = {7, 5, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddEvenAmountOfElementsThenTurnedArray() {
        int[] input = {4, 8, -32, 7, 10};
        int[] result = Turn.back(input);
        int[] expected = {10, 7, -32, 8, 4};
        Assert.assertArrayEquals(expected, result);
    }
}