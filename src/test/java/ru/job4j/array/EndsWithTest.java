package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'P', 'r', 'e', 's', 'e', 'n', 't'};
        char[] post = {'e', 'n', 't'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenEndWithPrefixThenFalse() {
        char[] word = {'P', 'r', 'e', 's', 'e', 'n', 't'};
        char[] post = {'t', 'e', 't'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }
}