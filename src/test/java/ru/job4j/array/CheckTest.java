package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[]{true, true, true};
        boolean result = Check.mono(input);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] input = new boolean[]{false, false, false};
        boolean result = Check.mono(input);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[]{true, false, true};
        boolean result = Check.mono(input);
        Assert.assertFalse(result);
    }

    @Test
    public void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = new boolean[] {false, true, false};
        boolean result = Check.mono(data);
        Assert.assertFalse(result);
    }
}