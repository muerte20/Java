package ru.mirea.lab2;

import java.util.Arrays;
import java.util.Random;

public class RandomArraySorting {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        System.out.println("Исходный массив:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // случайные числа от 0 до 99
            System.out.print(numbers[i] + " ");
        }

        Arrays.sort(numbers);

        System.out.println("\nОтсортированный массив:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

