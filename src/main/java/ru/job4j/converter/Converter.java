package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float euroToDollar(float value) {
        return value * 1.16f;
    }

    public static float dollarToEuro(float value) {
        return value * 0.85f;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(240);
        String result = String.format("%.2f", dollar);
        System.out.println("245 rubles are " + result + " dollar.");
        float dollar1 = Converter.euroToDollar(10);
        String result2 = String.format("%.2f", dollar1);
        System.out.println("10 euro are " + result2 + " dollar.");
        float euro2 = Converter.dollarToEuro(21);
        String result3 = String.format("%.1f", euro2);
        System.out.println("21 dollar are " + result3 + " euro.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        in = 240;
        expected = 4;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("240 rubles are 4 dollar. Test result : " + passed);
        in = 100;
        expected = 116;
        out = Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println("100 euro are 116 dollars. Test result : " + passed);
        expected = 85;
        out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("100 dollars are 85 euro. Test result : " + passed);
    }
}
