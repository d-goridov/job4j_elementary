package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] arrays = {{1}, {0, 4}, {3, 9, 11}, {2, 8, 12, 5}};
        for (int[] array : arrays) {
            System.out.println("Размер вложенного массива равен: " + array.length);
        }
    }
}