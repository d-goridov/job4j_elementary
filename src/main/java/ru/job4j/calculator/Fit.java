package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        double man = Fit.manWeight(heightMan);
        String result = String.format("%.2f", man);
        System.out.println("Man 187 is " + result);

        short heightWoman = 170;
        double woman = Fit.womanWeight(heightWoman);
        String result1 = String.format("%.2f", woman);
        System.out.println("Woman 170 is " + result1);

    }
}
