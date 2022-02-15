package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert10EurThen11dot6Dlr() {
        float in = 10;
        float expected = 11.6f;
        float out = Converter.euroToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);

    }

    @Test
    public void whenConvert10DolThen8dot5Eu() {
        float in = 10;
        float expected = 8.5f;
        float out = Converter.dollarToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}