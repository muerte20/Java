package ru.mirea.lab2;

public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        long factorial = calculateFactorial(n);
        System.out.println("Факториал числа " + n + " равен " + factorial);
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
