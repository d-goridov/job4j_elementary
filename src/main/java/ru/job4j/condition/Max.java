package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, second) > third ? max(first, second) : third;
    }

    public static  int max(int first, int second, int third, int forth) {
        return max(first, second) > max(third, forth) ? max(first, second) : max(third, forth);
    }

    public static void main(String[] args) {
        System.out.println(max(2, 2));
        System.out.println(max(65, 21));
        System.out.println(max(12, 28));
    }
}
