package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertTrue(result);
    }

    @Test
    public void whenStartWithPrefixThenFalse() {
        char[] word = {'C', 'h', 'a', 'm', 'p', 'i', 'o', 'n'};
        char[] pref = {'C', 'a', 'h'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertFalse(result);
    }

}